package Algorithm;

public class Text2 {
    public static class Block {
        int maxValue;
        int startIndex;
        int endIndex;

        public Block(int maxValue, int startIndex, int endIndex) {
            this.maxValue = maxValue;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 3, 15,    // 第一块
                22, 18, 25, 16, 20, 30,   // 第二块
                35, 42, 33, 40, 38, 45};  // 第三块
        Block[] blocks = new Block[3];
        blocks[0] = new Block(15, 0, 5); // 第一块的最大值是15，索引范围为0到5（包含）
        blocks[1] = new Block(30, 6, 11); // 第二块的最大值是30，索引范围为6到11（包含）
        blocks[2] = new Block(45, 12, 17); // 第三块的最大
        int number = 25;
        int index = findMax(blocks, arr, number);
        if (index != -1) {
            System.out.println("找到数字" + number + "在数组中的位置：" + index);
        } else {
            System.out.println("未找到数字" + number + "在数组中的位置");
        }
    }

    public static int findBlock(Block[] blocks, int number) {
        // 查找数字所在的块
        for (int i = 0; i < blocks.length; i++) {
            if (number<=blocks[i].maxValue) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(Block[] blocks, int[] arr, int number) {
        // 查找数字所在的块，然后在该块中查找数字
        int blockIndex = findBlock(blocks, number);
        if (blockIndex == -1) {
            return -1;
        }
        int startIndex = blocks[blockIndex].startIndex;
        int endIndex = blocks[blockIndex].endIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}

