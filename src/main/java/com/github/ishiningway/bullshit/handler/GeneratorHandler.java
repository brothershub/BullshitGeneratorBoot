package com.github.ishiningway.bullshit.handler;

import cn.hutool.core.io.file.FileReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ishiningway.bullshit.entity.Data;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Description 生成器
 *
 * @author ishiningway
 * @version V1.0.0
 * @since 2020/11/27 23:10
 */
public class GeneratorHandler {

    public static String xx = "学生会退会";

    static{
        String result = "";
        File jsonDataFile = new File("data.json");
        ObjectMapper mapper = new ObjectMapper();//此处引入的是jackson中的ObjectMapper类
        Data jsonDataObject = null;
        try {
            jsonDataObject = mapper.readValue(jsonDataFile, Data.class);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        FileReader fileReader = new FileReader(jsonDataFile);
        result = fileReader.readString();
        List<String> famousQuotesList = jsonDataObject.getFamous();// a 代表前面垫话，b代表后面垫话
        List<String> beforeWords = jsonDataObject.getBefore();// 在名人名言前面弄点废话
        List<String> afterWords = jsonDataObject.getAfter();// 在名人名言后面弄点废话
        List<String> bullShit = jsonDataObject.getBosh();// 代表文章主要废话来源


        int theComplexity = 2;//复杂度
//
//        def 洗牌遍历(列表):
//        global 重复度
//        池 = list(列表) * 重复度
//        while True:
//        random.shuffle(池)
//        for 元素 in 池:
//        yield 元素
//
//        下一句废话 = 洗牌遍历(废话)
//        下一句名人名言 = 洗牌遍历(名人名言)
//
        String nextBullShit = traverse();
        String nextFamousQuotes = traverse();
    }

    public static String nextBullShit(List<String> bullShit){
        return traverse(bullShit);
    }

    public static String nextFamousQuotes(List<String> bullShitList){
        return traverse(bullShitList);
    }

    public static String traverse(List<String> list){
        List<String> listPool = list * theComplexity;
    }


    public static String someFamousQuotes(){
        String nextFamousQuotes = "";
        xx = next(下一句名人名言);
        xx = xx.replace(  "a",random.choice(前面垫话) );
        xx = xx.replace(  "b",random.choice(后面垫话) );
        return xx;
    }

    public static String newParagraph(){
        xx = ". ";
        xx += "\r\n";
        xx += "    ";
        return xx;
    }

}
