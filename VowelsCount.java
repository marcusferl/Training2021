public class VowelsCount {
    
    public static void main(String[] args) {
        System.out.println(getCount("abaca"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char strarray [] = str.toCharArray();
        char vowles []= "aeiou".toCharArray();
        
        for(int i = 0 ; i< strarray.length ;i++ ){
            for(int j = 0; j < vowles.length; j++){
                if(strarray[i] == vowles[j]){
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
      }
}
