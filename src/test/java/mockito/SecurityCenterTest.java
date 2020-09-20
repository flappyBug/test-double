package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter center = new SecurityCenter(doorPanel);
        center.switchOn();
        verify(doorPanel, times(1)).close();
    }
}
