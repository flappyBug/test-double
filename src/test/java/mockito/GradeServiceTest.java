package mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;
import stub.GradeSystemStub;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem system = mock(GradeSystem.class);
        when(system.gradesFor(anyLong())).thenReturn(Arrays.asList(80., 90., 100.));
        GradeService service = new GradeService(system);
        Assertions.assertEquals(90.0, service.calculateAverageGrades(anyLong()));
    }
}
