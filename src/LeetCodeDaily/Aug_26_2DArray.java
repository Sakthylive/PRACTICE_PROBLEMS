package LeetCodeDaily;

public class Aug_26_2DArray {
    public static void main(String[] args) {

        int[][] arr = {{25,60},{39,52},{16,63},{33,56},{9,2},{3,5},{3,5}};
        //[[2,6],[5,1],[3,10],[8,4]]
        //[[6,5],[8,6],[2,10],[8,1],[9,2],[3,5],[3,5]]
        //[25,60],[39,52],[16,63],[33,56]]


        System.out.println(areaOfMaxDiagonal(arr));

    }

    public static  int areaOfMaxDiagonal(int[][] dimensions) {

        Double maxValue =0.0;
        Double currentValue =0.0;
        int area=0;
        for(int i=0; i<dimensions.length;i++){

            currentValue= Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));

            System.out.println("the square root of " +dimensions[i][0] +" "+ +dimensions[i][1] +" is "+ currentValue +"and current area is "+area);

           if(currentValue > maxValue) {
               area = dimensions[i][0] * dimensions[i][1];
           }
           if(currentValue.equals(maxValue)){
               area = Math.max(area,dimensions[i][0] * dimensions[i][1]);
           }
            maxValue = Math.max(maxValue,currentValue);
        }
        return area;
    }
}
