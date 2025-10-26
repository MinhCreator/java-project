
import java.util.*;

public class vector {

    public static double[] vector_plus(double vec_A[], double vec_B[]) {

        int length = vec_A.length;
        double[] vec_plus = {};
        for (int i = 0; i < length; i++) {

            vec_plus[i] = vec_A[i] + vec_B[i];

        }

        return vec_plus;

    }
    
    public static double[] vector_minus(double vec_A[], double vec_B[]) {

        int length = vec_A.length;
        double[] vec_minus = {};
        for (int i = 0; i < length; i++) {

            vec_minus[i] = vec_A[i] - vec_B[i];

        }

        return vec_minus;
    }
    
    public static double[] vector_multiply_number_nonDirection(double vec_A[], double nonDir) {

        int length = vec_A.length;
        for (int i = 0; i < length; i++) {

            vec_A[i] = nonDir * vec_A[i];

        }

        return vec_A;

    }

    public static double vector_nonDirection(double vec_A[], double vec_B[]) {

        int length = vec_A.length;
        double dot = 0;
        for (int i = 0; i < length; i++) {

            dot += vec_A[i] * vec_B[i];

        }

        return dot;
    }
    
    public static double vector_Length(double vec_A[]) {

        double normalized = 0;
        for (double value : vec_A) {

            normalized += value * value;

        }

        return Math.sqrt(normalized);
    }
    
    public static double[] unitVec(double vec_A[]) {
        // vec[0] = i, vec[1] = j, vec[3] = k this is unit vector   
        double[] unitVector = { vec_A[0], vec_A[1], vec_A[3] };

        return unitVector;
    }

    public static double[] vector_multiply_direction(double vec_A[], double vec_B[]) {

        double direction[] = {};
        for (int index = 0; index < vec_A.length; index++) {

            direction[index] = vec_A[index] * vec_B[index];

        }

        return direction;
    }

    public static double calculateCosineSimilarity(double[] vectorA, double[] vectorB) {
            if (vectorA.length != vectorB.length) {
                throw new IllegalArgumentException("Vectors must have the same dimension.");
            }

            double dotProduct = 0.0;
            double normA = 0.0;
            double normB = 0.0;

            for (int i = 0; i < vectorA.length; i++) {
                dotProduct += vectorA[i] * vectorB[i];
                normA += Math.pow(vectorA[i], 2);
                normB += Math.pow(vectorB[i], 2);
            }

            double magnitudeA = Math.sqrt(normA);
            double magnitudeB = Math.sqrt(normB);

            if (magnitudeA == 0 || magnitudeB == 0) {
                return 0.0; // Handle cases where one or both vectors are zero vectors
            }

            return dotProduct / (magnitudeA * magnitudeB);
        }

    public static void main(String[] args) {
        
        double[] vec_A = {};
        double[] vec_B = {};
        int space_size;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter space size: ");
        space_size = in.nextInt();
        
        for (int i = 0; i < space_size; i++) {
            System.out.println("Enter vector A[" + i + "]: ");
            vec_A[i] = in.nextDouble();
        }
        
        for (int i = 0; i < space_size; i++) {
            System.out.println("Enter vector B[" + i + "]: ");
            vec_B[i] = in.nextDouble();
        }

        System.out.println("Enter non direction number: ");
        double nonDir_number = in.nextDouble();

        double[] vec_plus = vector_plus(vec_A, vec_B);
        double[] vec_minus = vector_minus(vec_A, vec_B);
        double dot = vector_nonDirection(vec_A, vec_B);
        double vector_Length = vector_Length(vec_A);
        double[] unitVec = unitVec(vec_A);
        
        
        double[] nonDir = vector_multiply_number_nonDirection(vec_A, nonDir_number);
        double cosineSimilarity = calculateCosineSimilarity(vec_A, vec_B);
        
        System.out.println("Vector A + Vector B: " + Arrays.toString(vec_plus));
        System.out.println("Vector A - Vector B: " + Arrays.toString(vec_minus));
        System.out.println("Dot product: " + dot);
        System.out.println("Vector Length: " + vector_Length);
        System.out.println("Unit Vector: " + Arrays.toString(unitVec));
        System.out.println("Non Direction Vector: " + Arrays.toString(nonDir));
        System.out.println("Cosine Similarity: " + cosineSimilarity);
        if (space_size > 2) {
            
            double[] vec_direction = vector_multiply_direction(vec_A, vec_B);
            System.out.println("Vector Direction: " + Arrays.toString(vec_direction));
        }
    }
}