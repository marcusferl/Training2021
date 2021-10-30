public class HowMuchTrue{



public static void main(String[] args) {
    
}

public static int counTrue(boolean[] arr){
int counter = 0;

for(int i = 0; i < arr.length; i++){
    if(arr[i] == true){
        counter++;
    }
}

return counter;

}
}