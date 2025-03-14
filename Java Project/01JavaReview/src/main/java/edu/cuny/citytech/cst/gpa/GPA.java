<<<<<<< HEAD
package edu.cuny.citytech.cst.gpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GPA {

    public record Score (float range1, float range2, String letterGrade, float gpa) {}

    static List<Score> scoreTable = Arrays.asList(
    		
            new Score(0F, 59.9F, "F", 0F),
            new Score(60F, 74.9F, "D", 1F),
            new Score(75F, 76.9F, "C", 2F),
            new Score(77F, 79.9F, "C+", 2.3F),
            new Score(80F, 82.9F, "B-", 2.7F),
            new Score(83F, 86.9F, "B", 3F),
            new Score(87F, 89.9F, "B+", 3.3F),
            new Score(90F, 92.9F, "A-", 3.7F),
            new Score(93F, 100F, "A", 4F),
            new Score(100.0001F, 100F, "A+", 4.3F)
        );
    
        public static float getQPA(String letterGrade) {
        	var gpa = scoreTable.stream().filter(e-> e.letterGrade.trim().equals(letterGrade)).findFirst();
        	if(gpa.isPresent())
        		return gpa.get().gpa();
        	return 0.01f;
        }
        
        public static Score calculateGrade(float score) {
        	
            Optional<Score> result = scoreTable.stream()
                    .filter(e -> e.range1() <= score && score <= e.range2())
                    .findFirst();

                if (result.isPresent())
                    return result.get();

                return new Score(0, 0, "?", 0);
        }

    }

=======
package edu.cuny.citytech.cst.gpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GPA {

    public record Score (float range1, float range2, String letterGrade, float gpa) {}

    static List<Score> scoreTable = Arrays.asList(
    		
            new Score(0F, 59.9F, "F", 0F),
            new Score(60F, 74.9F, "D", 1F),
            new Score(75F, 76.9F, "C", 2F),
            new Score(77F, 79.9F, "C+", 2.3F),
            new Score(80F, 82.9F, "B-", 2.7F),
            new Score(83F, 86.9F, "B", 3F),
            new Score(87F, 89.9F, "B+", 3.3F),
            new Score(90F, 92.9F, "A-", 3.7F),
            new Score(93F, 100F, "A", 4F),
            new Score(100.0001F, 100F, "A+", 4.3F)
        );
    
        public static float getQPA(String letterGrade) {
        	var gpa = scoreTable.stream().filter(e-> e.letterGrade.trim().equals(letterGrade)).findFirst();
        	if(gpa.isPresent())
        		return gpa.get().gpa();
        	return 0.01f;
        }
        
        public static Score calculateGrade(float score) {
        	
            Optional<Score> result = scoreTable.stream()
                    .filter(e -> e.range1() <= score && score <= e.range2())
                    .findFirst();

                if (result.isPresent())
                    return result.get();

                return new Score(0, 0, "?", 0);
        }

    }

>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
