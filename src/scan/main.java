package scan;

public class main {
    public static void main(String[] args) {
        int [] height = {5, 6, 2, 4};


    }
    int mountainPeak(int [] heights){
        int count = 0;
        if (heights.length == 1) return 1;
        if (heights[0] > heights[1]) count++;
        for(int i = 1; i < heights.length - 1; i++){
            if (heights[i] > heights[i-1] && heights[i] > heights[i+1]) count++;
        }
        if (heights[heights.length - 1] > heights[heights.length - 2] )count++;
        return count;
    }
}
