package com.github.ishiningway.bullshit;

import cn.hutool.core.util.RandomUtil;
import com.github.ishiningway.bullshit.handler.GeneratorHandler;

import java.util.Scanner;

/**
 * 临时启动main方法
 * @author ishiningway
 * */
public class GoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================自动狗屁不通文章生成器=========================");
        System.out.println("请输入文章主题:");
        String xx = sc.nextLine();
        String tmp = "";
        for(int i=0;i<xx.length();i++){
            while ( tmp.length() < 10000 ) {
                int branchesIndex = RandomUtil.randomInt(0, 100);
                if (branchesIndex < 5) {
                    tmp += GeneratorHandler.newParagraph();
                } else if (branchesIndex < 20) {
                    tmp += GeneratorHandler.someFamousQuotes();
                } else {
                    tmp += next(下一句废话);
                    tmp = tmp.replace("x", xx);
                }
            }
        }
        System.out.println(tmp);

    }
}
