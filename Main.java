public class Main {
    public static void main(String[] args) {

       /*Екі таңбалы сан берілген. Табу қажет:
а) құрамына 3 саны кіреді ме;
б) құрамына a саны кіреді ме;
 */
        String Eki_tanbali = "32";
        if(Eki_tanbali.contains("3") || Eki_tanbali.contains("a")){
            if(Eki_tanbali.contains("3")){
                System.out.println("құрамына 3 саны кіреді");
            }
            if(Eki_tanbali.contains("a")){
                System.out.println("құрамына a саны кіреді");
            }
        }
           /*Екі таңбалы сан берілген. Табу қажет:
a) құрамына 4 және 7 сандары кіреді ме;
б) құрамына 3, 6 және 9 сандары кіреді ме;
         */
        String Eki_Tanbali = "65";
        if(Eki_Tanbali.contains("4") || Eki_Tanbali.contains("7")){
            if (Eki_Tanbali.contains("4")){
                System.out.println("құрамына 4 саны кіреді");
            }
            if(Eki_Tanbali.contains("7")){
                System.out.println("құрамына 7 саны кіреді");
            }
        }else{
            System.out.println("құрамына 4 және 7 сандары кірмейди");
        }
        if(Eki_Tanbali.contains("3") || Eki_tanbali.contains("6") || Eki_Tanbali.contains("9")){
            if(Eki_Tanbali.contains("3")){
                System.out.println("құрамына 3 саны кіреді");
            }
            if(Eki_Tanbali.contains("6")){
                System.out.println("құрамына 6 саны кіреді");
            }
            if(Eki_Tanbali.contains("9")){
                System.out.println("құрамына 9 саны кіреді");
            }
        }else{
            System.out.println("құрамына 3, 6 және 9 сандары кірмейди");
        }
          /*Үш таңбалы сан берілген. Табу қажет:
a) құрамына 6 саны кіреді ме;
б) құрамына n саны кіреді ме;
         */
        String ush_tanbali = "654";
        if(ush_tanbali.contains("6") || ush_tanbali.contains("n")){
            if(ush_tanbali.contains("6")){
                System.out.println("құрамына 6 саны кіреді");
            }if(ush_tanbali.contains("n")){
                System.out.println("құрамына n саны кіреді");
            }
        }else{
            System.out.println(" құрамына 6 және n сандары кірмейди");
        }
        /*Үш таңбалы сан берілген. Табу қажет:
a) құрамына 4 және 7 сандары кіреді ме;
б) құрамына 3, 6 және 9 сандары кіреді ме;
//145
//1, 4, 5
         */
        String Ush_tanbali = "485";
        if(Ush_tanbali.contains("4") || Ush_tanbali.contains("7")){
            if(Ush_tanbali.contains("4")){
                System.out.println("құрамына 4 саны кіреді");
            }
            if(Ush_tanbali.contains("7")){
                System.out.println("құрамына 7 саны кіреді");
            }
        }else{
            System.out.println(" құрамына 4 және 7 сандары кірмейди");
        }
        if(Ush_tanbali.contains("3") || Ush_tanbali.contains("6") || Ush_tanbali.contains("9")){
            if(Ush_tanbali.contains("3")){
                System.out.println("құрамына 3 саны кіреді");
            }
            if(Ush_tanbali.contains("6")){
                System.out.println("құрамына 6 саны кіреді");
            }
            if(Ush_tanbali.contains("9")){
                System.out.println("құрамына 9 саны кіреді");
            }
        }else{
            System.out.println("құрамына 3, 6 және 9 сандары кірмейди");
        }
        /*Төрт таңбалы сан берілген. Табу қажет:
а) құрамына 4 саны кіреді ме;
б) құрамына b саны кіреді ме;
         */
        String Tort_Tanbali = "6547";
        if(Tort_Tanbali.contains("4")||Tort_Tanbali.contains("b")){
            if(Tort_Tanbali.contains("4")){
                System.out.println("құрамына 4 саны кіреді");
            }if(Tort_Tanbali.contains("b")){
                System.out.println("құрамына b саны кіреді");
            }
        }else{
            System.out.println("құрамына 4 және b сандары кірмейди");
        }

        /*  Төрт таңбалы сан берілген. Табу қажет:
а) құрамына 2 және 7 сандары кіреді ме;
б) құрамына 3, 6 және 9 сандары кіреді ме;
         */


        String tort_tanbali = "6642";
        if(tort_tanbali.contains("2")||tort_tanbali.contains("7")){
            if(tort_tanbali.contains("2")){
                System.out.println("құрамына 2 саны кіреді");
            }
            if(tort_tanbali.contains("7")){
                System.out.println("құрамына 7 саны кіреді");
            }
        }else{
            System.out.println("құрамына 2 және 7 сандары кірмейди");
        }
        if(tort_tanbali.contains("3")||tort_tanbali.contains("6")||tort_tanbali.contains("9")){
            if(tort_tanbali.contains("3")){
                System.out.println("құрамына 3 саны кіреді");
            }
            if(tort_tanbali.contains("6")){
                System.out.println("құрамына 6 саны кіреді");
            }
            if(tort_tanbali.contains("9")){
                System.out.println("құрамына 9 саны кіреді");
            }
        }else{
            System.out.println("құрамына 3, 6 және 9 сандары кірмейди");
        }
        /*
        n саны берілген. Оның төрт санын ескере отырып, палиндром (“перевертыш”) екенын анықтау, мысалы, 7777, 8338, 0331 және т.б. сандары секілді (Палиндром деп ондық белгісі солдан оңға және оңнан солға бірдей оқылатын санды айтады).
         */
        String n1 ="1221";
        if(n1.charAt(3)==n1.charAt(0)&&n1.charAt(2)==n1.charAt(1)){
            System.out.println("Это париндром");
        }else{
            System.out.println("это не палиндром");
        }




        /*
        n саны берілген. Сан құрамында, төрт таңбалы сан екенін ескере отырып, үш бірдей сан бар екенін анықтау. Мысалы, 3363, 4844, 1300 және т.б.
         */
        String san = "4844";
        if((san.charAt(0)==san.charAt(1)&&san.charAt(0)==san.charAt(3))||(san.charAt(0)==san.charAt(2)&&san.charAt(0)==san.charAt(3))||(san.charAt(1)==san.charAt(2)&&san.charAt(1)==san.charAt(3))){

            System.out.println("үш бірдей сан бар");
        }else{
            System.out.println("үш бірдей сан жок");
        }






        /*
        n саны берілген. Төрт таңбалы сан екенін ескере отырып, оның құрамындағы сандар әртүрлі екенін анықтау. Мысалы, 3678 санында барлығы әртүрлі, ал 1013 санында - жоқ.
         */
        String san_n = "3678";
        if(san_n.charAt(0)!=san_n.charAt(1)&&san_n.charAt(0)!=san_n.charAt(2)&&san_n.charAt(0)!=san_n.charAt(3)&&san_n.charAt(1)!=san_n.charAt(2)&&san_n.charAt(1)!=san_n.charAt(3)&&san_n.charAt(2)!=san_n.charAt(3)){
            System.out.println("Все числа разные");
        }else{
            System.out.println("Не все числа разные");
        }



        /*
        Алты таңбалы сан “бақытты сан” екенін анықтау. (Бақытты сан деп бастапқы үш санының қосындысы соңғы үш санының қосындысына тең алты таңбалы санды айтады.)
//112202
//122213
         */
        String a = "112202";
        if (a.charAt(0)+a.charAt(1)+a.charAt(2)==a.charAt(3)+a.charAt(4)+a.charAt(5)){
            System.out.println("бақытты сан");
        }else{
            System.out.println("бақытты сан емес");
        }



        /*
        Боксер салмағы берілген. Боксер осы үш салмақ категориясының біреуіне кіретіні белгілі:
1) жеңіл салмақ — 60 кг дейін;
2) бірінші жартылай-орта салмақ — 64 кг дейін;
3) жартылай-орта салмақ — 69 кг дейін;
Боксер кай категорияда өнер көрсететінін анықтау
         */
        int ves = 65;
        if (ves>=60){
            System.out.println("жеңіл салмақ");
        } else if (60<ves && ves<=69) {
            System.out.println("бірінші жартылай-орта салмақ — 64 кг дейін;");
        } else if (69<ves && ves<=69) {
            System.out.println("жартылай-орта салмақ");
        } else{
            System.out.println("Invalid");
        }

        /*
        Апта күнінің реттік номері бойынша (1, 2, …,7) оның атын (Дүйсенбі, Сейсенбі, …, Жексенбі) шығаратын программаны құрастыру.
         */
        int Дүйсенбі = 1;
        int Сейсенбі = 2;
        int сәрсенбі = 3;
        int бейсенбі = 4;
        int жұма =5;
        int сенбі =6;
        int жексенбі =7;
        if(Дүйсенбі==1){
            System.out.println("Дүйсенбі");
        }else{
            System.out.println("Invalid");
        }if (Сейсенбі==2) {
            System.out.println("Сейсенбі");
        }else{
            System.out.println("Invalid");
        }if (сәрсенбі==3) {
            System.out.println("сәрсенбі");
        }else{
            System.out.println("Invalid");
        }if (бейсенбі==4) {
            System.out.println("бейсенбі");
        }else{
            System.out.println("Invalid");
        }if (жұма==5) {
            System.out.println("жұма");
        }else{
            System.out.println("Invalid");
        }if (сенбі==6) {
            System.out.println("сенбі");
        }else{
            System.out.println("Invalid");
        }if (жексенбі==7) {
            System.out.println("жексенбі");
        }else{
            System.out.println("Invalid");
        }


        /*
        Ай күнінің реттік номері бойынша (1, 2, …,12) оның атын (Қаңтар, Ақпан, …, Желтоқсан) шығаратын программаны құрастыру.
         */
        int month =2;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


                /*
        Ай күнінің реттік номері бойынша (1, 2, …,12) оның қай жыл мезгіліне жататынын анықтайтын программаны құрастыру.
         */
        int mounth_2 = 2;
        switch(mounth_2){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

















    }
}