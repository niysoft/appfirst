package com.example.tsaboindeveloper.dailybela;

/**
 * Created by Tsaboin Developer on 7/25/2015.
 */
public class contentProvider {

      private  static String[] itemAll ={
            "1-Nation-#e57b34 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "3-Politics-#1d7fb7 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "9-Opinion-#778899 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "12-foreign-#10a8b5 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "13-Living-#cccccc - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "1-Nation-#e57b34 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "3-Politics-#1d7fb7 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "9-Opinion-#778899 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "12-foreign-#10a8b5 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "13-Living-#cccccc - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "1-Nation-#e57b34 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "3-Politics-#1d7fb7 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "9-Opinion-#778899 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "12-foreign-#10a8b5 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "13-Living-#cccccc - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "12-foreign-#10a8b5 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "13-Living-#cccccc - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "1-Nation-#e57b34 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "3-Politics-#1d7fb7 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "9-Opinion-#778899 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "9-Opinion-#778899 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "11-interview-#519924 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "12-foreign-#10a8b5 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "13-Living-#cccccc - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "1-Nation-#e57b34 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "3-Politics-#1d7fb7 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "6-Sport-#E30B21 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
            "8-Headline-#9600b4 - Safari  would like to use a LinearLayout to position two TextViews in a single row",
    };
  private  static Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
    };
    private static String[] spinnerStr={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};
    public void contentProvider(){

    }

    public static String[] getNews(){
        return itemAll;
    }

    public static Integer[] getImages(){
        return imgid;
    }

    public static String[] getSpinnerStr(){
        return spinnerStr;
    }
}

