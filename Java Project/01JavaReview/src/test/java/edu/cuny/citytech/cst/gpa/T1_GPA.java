<<<<<<< HEAD
package edu.cuny.citytech.cst.gpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1_GPA {

    @Test // 60-74.9%  D  1.0
    @DisplayName("D is associated with 1.0")
    public void t1() {
        GPA.Score score = GPA.calculateGrade(60);
        float expected = 1.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 93-100%  A  4.0
    @DisplayName("A is associated with 4.0")
    public void t2() {
        GPA.Score score = GPA.calculateGrade(95);
        float expected = 4.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 90-92.9%  A-  3.7
    @DisplayName("A- is associated with 3.7")
    public void t3() {
        GPA.Score score = GPA.calculateGrade(91);
        float expected = 3.7f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 87-89.9%  B+  3.3
    @DisplayName("B+ is associated with 3.3")
    public void t4() {
        GPA.Score score = GPA.calculateGrade(88);
        float expected = 3.3f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 83-86.9%  B  3.0
    @DisplayName("B is associated with 3.0")
    public void t5() {
        GPA.Score score = GPA.calculateGrade(85);
        float expected = 3.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 80-82.9%  B-  2.7
    @DisplayName("B- is associated with 2.7")
    public void t6() {
        GPA.Score score = GPA.calculateGrade(81);
        float expected = 2.7f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 77-79.9%  C+  2.3
    @DisplayName("C+ is associated with 2.3")
    public void t7() {
        GPA.Score score = GPA.calculateGrade(78);
        float expected = 2.3f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 75-76.9%  C  2.0
    @DisplayName("C is associated with 2.0")
    public void t8() {
        GPA.Score score = GPA.calculateGrade(75);
        float expected = 2.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // Below 60  F  0.0
    @DisplayName("F is associated with 0.0")
    public void t9() {
        GPA.Score score = GPA.calculateGrade(50);
        float expected = 0.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }
}
=======
package edu.cuny.citytech.cst.gpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1_GPA {

    @Test // 60-74.9%  D  1.0
    @DisplayName("D is associated with 1.0")
    public void t1() {
        GPA.Score score = GPA.calculateGrade(60);
        float expected = 1.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 93-100%  A  4.0
    @DisplayName("A is associated with 4.0")
    public void t2() {
        GPA.Score score = GPA.calculateGrade(95);
        float expected = 4.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 90-92.9%  A-  3.7
    @DisplayName("A- is associated with 3.7")
    public void t3() {
        GPA.Score score = GPA.calculateGrade(91);
        float expected = 3.7f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 87-89.9%  B+  3.3
    @DisplayName("B+ is associated with 3.3")
    public void t4() {
        GPA.Score score = GPA.calculateGrade(88);
        float expected = 3.3f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 83-86.9%  B  3.0
    @DisplayName("B is associated with 3.0")
    public void t5() {
        GPA.Score score = GPA.calculateGrade(85);
        float expected = 3.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 80-82.9%  B-  2.7
    @DisplayName("B- is associated with 2.7")
    public void t6() {
        GPA.Score score = GPA.calculateGrade(81);
        float expected = 2.7f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 77-79.9%  C+  2.3
    @DisplayName("C+ is associated with 2.3")
    public void t7() {
        GPA.Score score = GPA.calculateGrade(78);
        float expected = 2.3f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // 75-76.9%  C  2.0
    @DisplayName("C is associated with 2.0")
    public void t8() {
        GPA.Score score = GPA.calculateGrade(75);
        float expected = 2.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test // Below 60  F  0.0
    @DisplayName("F is associated with 0.0")
    public void t9() {
        GPA.Score score = GPA.calculateGrade(50);
        float expected = 0.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
