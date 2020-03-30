public class BmiService {
    public float calculate(int weight,int height) {
        float result = (float)(weight *10_000) /(float) (height * height);
        return  result;
    }
}
