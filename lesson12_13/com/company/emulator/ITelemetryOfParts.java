package homework.lesson12_13.com.company.emulator;

import java.util.Collection;

public interface ITelemetryOfParts <T>{
    Collection<T> getParts();
    void engineCondition(); //состояние двигателей (вкл/выкл)
    void numberOfNotUndockedStage(); //номера не отстыкованных ступеней
    void quantityOfNotUndockedStage(); //колличество не отстыкованных ступеней

}
