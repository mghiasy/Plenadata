package com.example.Plenadata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class InputController {
    @GetMapping("/checkName")

    public @ResponseBody Result checkName(@RequestParam("inputName") String inputName) {
        System.out.println("inputName " + inputName);
        // StringBuilder result = new StringBuilder();
        char firstNotRepLetter='#';
        StringBuilder sb = new StringBuilder();
        Map<Character, int[]> map = new LinkedHashMap<>();
        for (char c : inputName.toCharArray()) {
            int num = c;
            c = Character.toLowerCase(c);
            int[] temp = (map.get(c) == null) ? new int[]{0, 0} : map.get(c);
            if (num >= 97 && num <= 122) {//lowercase
                temp[0]++;
                map.put(c, temp);
            } else if (num >= 65 && num <= 90) {//uppercase
                temp[1]++;
                map.put(c, temp);
            }
        }
        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            int occurrence = entry.getValue()[0] + entry.getValue()[1];
            if (occurrence == 1) {
                firstNotRepLetter = (entry.getValue()[0] ==1) ?entry.getKey() : Character.toUpperCase(entry.getKey());
                break;
            }
        }
        int i=1;
        int n =inputName.length();
        while (i<=n){
            for (Map.Entry<Character, int[]> entry : map.entrySet()) {
                int xx= entry.getValue()[0]+entry.getValue()[1];
                if(entry.getValue()[0]+entry.getValue()[1] ==i){
                    for(int j=0;j<entry.getValue()[1];++j){
                        sb.append(Character.toUpperCase(entry.getKey()));
                    }
                    for(int j=0;j<entry.getValue()[0];++j){
                        sb.append(entry.getKey());
                    }
                    n-=i;
                }

            }
            ++i;

        }

        Result result= new Result(firstNotRepLetter ,String.valueOf(sb));
        return result;
    }
}

