package kr.spartaclub.running.day03.step1;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        // 1. 아이돌 명단 준비 (데이터 소스)
        List<Idol> idols = List.of(
                new Idol("장원영", "IVE", 100),
                new Idol("안유진", "IVE", 95),
                new Idol("카즈하", "LE SSERAFIM", 90),
                new Idol("김채원", "LE SSERAFIM", 92),
                new Idol("닝닝", "AESPA", 88)
        );

        // IVE멤버들만 골라서, 점수순 오름차정렬후, 이름만 추출해주세요
        List<Idol> filteredMembers = new ArrayList<>();

        // 필터링
        for (Idol idol : idols) {
            /*
            idol.getTeam().equals("IVE"); // X
            "IVE".equals(idol.getTeam()); // O
            Objects.equals(idol.getTeam(), "IVE") // modern O

             */
            if ("IVE".equalsIgnoreCase(idol.getTeam())) {
                filteredMembers.add(idol);
            }
        }
        System.out.println("filteredMembers = " + filteredMembers);

        // 정렬...

        // 추출 및 변환
        List<String> nameList = new ArrayList<>();
        for (Idol filteredMember : filteredMembers) {
            nameList.add(filteredMember.getName());
        }
        System.out.println("======");
        System.out.println("nameList = " + nameList);

        System.out.println("==== stream 적용 ====");

        List<String> names = idols.stream()
                .filter(idol -> "IVE".equals(idol.getTeam()))
                .sorted(comparing(Idol::getName).reversed())
                .map(Idol::getName)
                .collect(toList());
        System.out.println("names = " + names);
    }
}