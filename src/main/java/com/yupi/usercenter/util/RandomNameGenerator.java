package com.yupi.usercenter.util;

import java.util.Random;

public class RandomNameGenerator {

    // 常见中文姓氏
    private static final String[] FAMILY_NAMES = {
        "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈",
        "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
        "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏"
    };

    // 常见中文名字（单字）
    private static final String[] FIRST_NAMES = {
        "伟", "芳", "娜", "敏", "静", "强", "磊", "军", "洋", "勇",
        "艳", "涛", "明", "超", "秀", "娟", "婷", "刚", "峰", "杰"
    };

    // 常见中文名字（双字）
    private static final String[] SECOND_NAMES = {
        "建国", "建华", "援朝", "跃进", "红卫", "卫东", "婷婷", "晶晶", "丽丽", "洋洋"
    };
    
    private static final Random random = new Random();

    /**
     * 生成一个随机中文用户名
     * @return 例如: "张伟", "李娜123"
     */
    public static String generateRandomChineseName() {
        // 1. 随机选择一个姓氏
        String familyName = FAMILY_NAMES[random.nextInt(FAMILY_NAMES.length)];

        // 2. 随机选择是单字名还是双字名
        boolean isSingleName = random.nextBoolean();

        String givenName;
        if (isSingleName) {
            givenName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        } else {
            givenName = SECOND_NAMES[random.nextInt(SECOND_NAMES.length)];
        }
        
        // 3. 组合成完整的名字
        String fullName = familyName + givenName;
        
        // 4. 为了降低重复率，可以在末尾添加1-3位随机数字 (可选)
        if (random.nextDouble() < 0.5) { // 50% 的概率添加数字
            int randomNum = random.nextInt(900) + 100; // 生成 100-999 的随机数
            fullName += randomNum;
        }
        
        return fullName;
    }
}