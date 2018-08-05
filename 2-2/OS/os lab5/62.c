#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/sem.h>
#include <sys/shm.h>
#include <sys/types.h>
#include <sys/ipc.h>

void sem_lock(struct sembuf sem_op, int sem_id)
{
	sem_op.sem_num = 0;
	sem_op.sem_op = -1;
	sem_op.sem_flg = 0;
	semop(sem_id, &sem_op, 1);

}
void sem_unlock(struct sembuf sem_op, int sem_id)
{
	sem_op.sem_num = 0;
	sem_op.sem_op = 1;
	sem_op.sem_flg = 0;
	semop(sem_id, &sem_op, 1);
}

int  main()
{
	int shmid = shmget(IPC_PRIVATE, 5 * sizeof(int), 0777 | IPC_CREAT);
	int sem_id = semget(IPC_PRIVATE, 1 , IPC_CREAT | 0777 );
	if(sem_id == -1)
	{
		printf("ERROR");
	}
	semctl(sem_id , 0, SETVAL, 1);
	int *a, *b;
	int pid = fork();
	if (pid == 0)
	{
		while(1)
		{
			struct sembuf sem_op;
			sem_lock(sem_op, sem_id);
			int c;
			a = shmat(shmid, 0 , 0);
			printf("Enter the number to be incremented\n");
			scanf("%d", &c);
			c-= 1;
			printf("Child decremented the value to %d\n", c);
			a[0] = c;
			sem_unlock(sem_op, sem_id);
		}
	}
	else
	{
		sleep(1);
		while(1)
		{
			struct sembuf sem_op;
			sem_lock(sem_op, sem_id);
			int c;
			b = shmat(shmid, 0 , 0);
			c = b[0];
			c += 1;
			printf("Parent incremented the value to %d\n\n", c);
			sem_unlock(sem_op, sem_id);
		}
	}
	return 0;
}