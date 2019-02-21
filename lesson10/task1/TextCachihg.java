package homework.lesson10.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TextCachihg {

    public static void main(String[] args) {
        HashMap <String,String> cashMap = new HashMap<>();
        List<String> doc1 = new ArrayList<>();
        List<String> doc2 = new ArrayList<>();

        doc1.add("Плачет метель, как цыганская скрипка.");
        doc1.add("Милая девушка, злая улыбка,");
        doc1.add("Я ль не робею от синего взгляда?");
        doc1.add("Много мне нужно и много не надо.");
        doc1.add("Так мы далеки и так не схлжи - ");
        doc1.add("Ты молодая, а я все прожил.");
        doc1.add("Юношам счастье, а мне лишь память");
        doc1.add("Снежною ночью в лихую замять.");
        doc1.add("Я не заласкан - буря мне скрипка");
        doc1.add("Сердце метелит твоя улыбка.");

        doc2.add("Над окошком месяц. Под окошком ветер.");
        doc2.add("Облетевший тополь серебрист и светел.");
        doc2.add("Дальний плач тальянки, голос одинокий -");
        doc2.add("И такой родимый, и такой далекий.");
        doc2.add("Плачет и смеется песня лиховая.");
        doc2.add("Где ты моя липа? Липа вековая?");
        doc2.add("Я и сам когда-то в праздник спозаранку");
        doc2.add("Выходил к любимой, заводил тальянку.");
        doc2.add("А теперь я милой ничего не значу.");
        doc2.add("Под чужую песню и смеюсь и плачу.");

        for (int i = 0; i < doc1.size(); i++){
            cashMap.put("doc1 - " + i, doc1.get(i));
        }
        for (int i = 0; i < doc2.size(); i++){
            cashMap.put("doc2 - " + i, doc2.get(i));
        }
        Set<HashMap.Entry<String,String>> set = cashMap.entrySet();
        for(HashMap.Entry<String,String> me: set){
            System.out.println(me.getKey()+" : " + me.getValue());
        }

    }

}
