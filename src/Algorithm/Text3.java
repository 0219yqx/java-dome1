package Algorithm;

public class Text3 {
    public static class Block {
        public int min;
        public int max;
        public int indexStart;
        public int indexEnd;

        public Block(int min, int max, int indexStart, int indexEnd) {
            this.min = min;
            this.max = max;
            this.indexStart = indexStart;
            this.indexEnd = indexEnd;
        }
    }
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36, 13, 19, 16, 20, 7, 10, 43, 50, 48};
        Block[] indexTable = new Block[4];
        indexTable[0] = new Block(22, 40, 0, 4); // 第一块：min=22, max=40, index:0~4
        indexTable[1] = new Block(13, 20, 5, 8); // 第二块：min=13, max=20, index:5~8
        indexTable[2] = new Block(7, 10, 9, 10); // 第三块：min=7, max=10, index:9~10
        indexTable[3] = new Block(43, 50, 11, 13); // 第四块：min=43, max=50, index:11~13
        int number=13;
        int index = searchIndex(arr,indexTable,number);
        if(index!=-1){
            System.out.println("找到数字"+number+"在数组中的索引位置为："+index);
        }
        else{
            System.out.println("未找到数字"+number+"在数组中的索引位置");
        }

    }
    public static int searchBlock(Block[] indexTable, int number){
        for(int i=0;i<indexTable.length;i++){
            if(number>=indexTable[i].min && number<=indexTable[i].max){
                return i;
            }
        }
        return -1;


    }
    public static int searchIndex(int[] arr, Block[] indexTable, int number) {
        int blockIndex = searchBlock(indexTable, number);
        if (blockIndex == -1) {
            return -1; // 未找到对应的块，返回-1表示未找到
        }
        Block block = indexTable[blockIndex];
        int start = block.indexStart;
        int end = block.indexEnd;

        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return i; // 找到数字，返回其在数组中的索引位置
            }
        }
        return -1; // 未找到数字，返回-1表示未找到

    }
}
