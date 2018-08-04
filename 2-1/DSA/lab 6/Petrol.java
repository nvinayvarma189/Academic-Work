 public class Petrol 
{
    static class petrolPump
    {
        int petrol;
        int distance;
        public petrolPump(int petrol, int distance) 
        {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
     
    static int printTour(petrolPump arr[], int n)
    {  
        int start = 0;
        int end = 1;
        int curr_petrol = arr[start].petrol - arr[start].distance;
         

        while(end != start || curr_petrol < 0)
        {
            while(curr_petrol < 0 && start != end)
            {
                curr_petrol -= arr[start].petrol - arr[start].distance;
                start = (start + 1) % n;
                 
                
                if(start == 0)
                {
                	System.out.println("No such petrol pump to complete the circle");
                    return -1;
                }
            }
         
            curr_petrol += arr[end].petrol - arr[end].distance;
             
            end = (end + 1)%n;
        }
         
      
        return start;
    }
     
    public static void main(String[] args) 
    {
         
        petrolPump[] arr = {new petrolPump(4, 6),
                            new petrolPump(6, 5), 	
                            new petrolPump(7, 3),
        					new petrolPump(4, 5)};
         
        int start = printTour(arr, arr.length);
         
        System.out.println(start == -1 ? "No Solution" : "Start = " + start); 
 
    }
 
}