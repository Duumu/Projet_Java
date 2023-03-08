public class TPimpro {
    public boolean IsBinarySumInArray(int[] integers, int val) {
        for(int i = 0; i < integers.length; i++){
            for (int j = i + 1; j < integers.length; j++){
                if(integers[i]+integers[j]==val){
                    return true;
                }
            }
        }
        return false;
    }
}
