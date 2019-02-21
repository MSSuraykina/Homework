package homework.lesson10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyAppABC {
    public static void main(String[] args) {
        TreeMap<Character, Integer> alphabet = new TreeMap<>();
        alphabet.put('а', 0);
        alphabet.put('б', 0);
        alphabet.put('в', 0);
        alphabet.put('г', 0);
        alphabet.put('д', 0);
        alphabet.put('е', 0);
        alphabet.put('ж', 0);
        alphabet.put('з', 0);
        alphabet.put('и', 0);
        alphabet.put('й', 0);
        alphabet.put('к', 0);
        alphabet.put('л', 0);
        alphabet.put('м', 0);
        alphabet.put('н', 0);
        alphabet.put('о', 0);
        alphabet.put('п', 0);
        alphabet.put('р', 0);
        alphabet.put('с', 0);
        alphabet.put('т', 0);
        alphabet.put('у', 0);
        alphabet.put('ф', 0);
        alphabet.put('х', 0);
        alphabet.put('ц', 0);
        alphabet.put('ч', 0);
        alphabet.put('ш', 0);
        alphabet.put('щ', 0);
        alphabet.put('ь', 0);
        alphabet.put('ы', 0);
        alphabet.put('э', 0);
        alphabet.put('ю', 0);
        alphabet.put('я', 0);

        String test = "Из доклада Ю. А. Гагарина:\n" +
                "Минутная готовность — и старт. Со старта... слышно, когда разводят фермы,\n" +
                "получаются какие-то немного мягкие удары, но прикосновение чувствую по\n" +
                "конструкции, по ракете идёт. Чувствуется, ракета немного покачивается.\n" +
                "Потом началась продувка, захлопали клапаны. Запуск. На предварительную\n" +
                "ступень выход. Дали зажигание, заработали двигатели, шум. Затем\n" +
                "промежуточная ступень, шум усилился несколько. Когда двигатель вышел на\n" +
                "главную, основную ступень, шум был такой приблизительно, как в самолёте. Во\n" +
                "всяком случае, я готов был к большему шуму. Ну и так плавно, мягко она снялась\n" +
                "с места, что я не заметил, когда она пошла. Потом чувствую, как мелкая\n" +
                "вибрация идёт по ней. Примерно в районе 70 секунд плавно меняется характер\n" +
                "вибрации. Частота вибрации падает, а амплитуда растёт. Тряска больше\n" +
                "получается в это время. Потом постепенно эта тряска затихает, и к концу\n" +
                "работы первой ступени вибрация становится как в начале работы. Перегрузка\n" +
                "плавно растёт, но нормально переносится, как на обычных самолётах. В этой\n" +
                "перегрузке я вёл связь со стартом. Даже при таких пробах немного трудно\n" +
                "разговаривать: стягивает все мышцы лица.\n" +
                "Потом перегрузка растёт, примерно достигает своего пика и начинает плавно\n" +
                "вроде уменьшаться, и затем резкий спад этих перегрузок, как будто вот что-то\n" +
                "такое отрывается сразу от ракеты... Ну а потом начинает эта перегрузка\n" +
                "расти, начинает прижимать, уровень шума уже меньше так, значительно\n" +
                "меньше. На 150-й секунде слетел головной обтекатель... Такой тоже получился\n" +
                "толчок, хлопок, толчок, и одна половина этого обтекателя как раз была против\n" +
                "«Взора»... И этот обтекатель так медленно пошёл от «Взора», так он\n" +
                "раскрылся, прямо видно конус этот весь, и он так медленно пошёл вниз, туда, за\n" +
                "ракету.\n" +
                "В это время во «Взоре» видна Земля была. Очень хорошо, резкая, как раз ни\n" +
                "облачности, ничего не было, и прямо складки местности, немножко гористый\n" +
                "район какой-то был, по-моему.\n" +
                "\n" +
                "Складки местности видно, лес видно, где реки большие, вот я не привязал, не\n" +
                "мог, конечно, там очень мало расстояние, или Обь, по-моему. Обь там была\n" +
                "где-то в этом районе. Или Иртыш...\n" +
                "Продолжался полёт, кончила работу третья ступень. Затем, примерно секунд\n" +
                "через десять произошло разделение, почувствовал я толчок на корабль — и\n" +
                "началось медленное вращение.\n" +
                "Ну тут видел я горизонт, всё время вёл репортаж, звёзды, небо чёрное, прямо\n" +
                "совершенно чёрный цвет неба... Очень красивый горизонт, видно прямо\n" +
                "окружность Земли, горизонт и такой голубой цвет вокруг всей Земли, вокруг\n" +
                "горизонта, такой нежный-нежный голубой цвет у самой поверхности Земли,\n" +
                "затем постепенно темнеет, фиолетовый оттенок приобретает и переходит в\n" +
                "чёрный цвет. В это время вёл устойчивую, хорошую связь с Колпашевым —\n" +
                "Зарей - 2.";


        Set<Map.Entry<Character, Integer>> set = alphabet.entrySet();
        for (Map.Entry<Character, Integer> me : set) {
            for (int i = 0; i < test.length(); i++) {
                if (me.getKey().equals(test.toLowerCase().charAt(i))){
                    me.setValue(me.getValue() + 1);//System.out.println(me.getKey()+" : " + me.getValue());
                }
            }
        }

        Set<Map.Entry<Character, Integer>> set_1 = alphabet.entrySet();
        for (Map.Entry<Character, Integer> me : set_1) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}