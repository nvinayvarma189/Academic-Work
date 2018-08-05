#include <stdio.h>
#include <stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/sem.h>
#include <unistd.h>
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
int main()
{
	int shmid = shmget(IPC_PRIVATE, 5 * sizeof(int), 0777 | IPC_CREAT);
	int sem_id = semget(IPC_PRIVATE, 1, IPC_CREAT | 0777);
	semctl(sem_id,0, SETVAL, 1);
	int *a, *b, *c, *d, *e;
	int rev1=50;
	int paper=20;
	int i;
	a=shmat(shmid, 0, 0);
	a[0]=rev1;
	while(1){
	printf("please select the registeration or deregisteration\n");
	scanf("%d",&i); 
	if(i==1){
		if(rev1>0){
			int pid= fork();
			if(pid==0){
			struct sembuf sem_op;
			sem_lock(sem_op, sem_id);
			a=shmat(shmid, 0, 0);
			int rev=a[0];
			rev--;
			rev1=rev;
			a[0]=rev;
			printf("The registeration no is %d\n", rev);
			sem_unlock(sem_op, sem_id);
			shmdt(a);
			}
			else{
				wait(1);
			}
		}
		else{
			printf("reservation not possible\n");
		}
	}
	else if(i==2){
		if(rev1<50){
			int se;
			int pid=fork();
			if(pid==0){
			struct sembuf sem_op;
			sem_lock(sem_op, sem_id);
			b=shmat(shmid, 0, 0);
			int rev=b[0];
			rev++;
			rev1=rev;
			b[0]=rev1;
			printf("The registeration no is %d\n", rev);
			sem_unlock(sem_op, sem_id);
			}
			else{
				wait(1);
			}
		}
		else{
			printf("de registeration not possible\n");
		}	
	}
	}
}
