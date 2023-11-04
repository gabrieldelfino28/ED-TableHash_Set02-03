package view;

import controller.newHash;
import fateczl.Lista.model.Lista;

public class Main {

    public static void main(String[] args) {
        Lista<Integer>[] l = new Lista[10];
        for (int i = 0; i < 10; i++) {
            l[i] = new Lista<>();
        }
        //Chumbando a tabela hash anterior:
        try {
            //0
            l[0].addFirst(12);
            l[0].addLast(647);
            l[0].addLast(158);
            l[0].addLast(136);
            l[0].addLast(467);
            //1
            l[1].addFirst(156);
            l[1].addLast(600);
            l[1].addLast(551);
            //2
            l[2].addFirst(263);
            l[2].addLast(414);
            l[2].addLast(882);
            l[2].addLast(945);
            l[2].addLast(953);
            l[2].addLast(629);
            //3
            l[3].addFirst(884);
            l[3].addLast(795);
            l[3].addLast(144);
            l[3].addLast(513);
            //4
            l[4].addFirst(591);
            l[4].addLast(847);
            l[4].addLast(66);
            l[4].addLast(337);
            l[4].addLast(979);
            //5
            l[5].addFirst(768);
            l[5].addLast(53);
            //6
            l[6].addFirst(114);
            l[6].addLast(803);
            l[6].addLast(90);
            l[6].addLast(339);
            l[6].addLast(550);
            //7
            l[7].addFirst(574);
            l[7].addLast(977);
            l[7].addLast(216);
            l[7].addLast(99);
            l[7].addLast(617);
            l[7].addLast(88);
            //8
            l[8].addFirst(142);
            l[8].addLast(148);
            l[8].addLast(227);
            l[8].addLast(939);
            l[8].addLast(585);
            l[8].addLast(388);
            l[8].addLast(206);
            //9
            l[9].addFirst(569);
            l[9].addLast(708);
            l[9].addLast(844);
            newHash h = new newHash();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < l[i].size(); j++ ) {
                    h.add(l[i].get(j));
                }
            }
            h.print();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
