package Chap03;

import java.util.*;

class PhyExamSearch {
    //身体検査データ
    static class PhyscData {
        private String name;
        private int height;
        private double vision;
        
        //コンストラクタ
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        
        //文字列化
        public String toString() {
            return name + " " + height + " " + vision;
        }
        
        //身長昇順用コンパレータ
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
    }
}