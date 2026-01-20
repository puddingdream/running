package kr.spartaclub.running.day03.step5;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500));


        System.out.println("---2022년 예약된 여행정보---");
        bookings.stream()
                .filter(booking -> booking.getYear() == 2022)
                .sorted(Comparator.comparing(booking -> booking.getPrice()))
                .forEach(System.out::println);

        System.out.println("---국가이름---");
        // 여행지가 포함된 모든 국가의 이름을 중복없이 리스트로
        List<Destination> list = bookings.stream()
                .map(booking -> booking.getDestination())
                .distinct()
                .toList();
        System.out.println("국가이름 = " + list);

        //  모든 여행자의 이메일 주소를 수집해서 알파벳순으로 정렬된 리스트뽑기
        System.out.println("여행자의 이메일주소를 알파벳순서로");
        List<String> list1 = bookings.stream()
                .map(booking -> booking.getTraveler().getEmail())
                .sorted()
                .toList();
        System.out.println("list1 = " + list1);

        // 이탈리아에 가는 여행 예약이 1건이라도 있는지 확인하기
        System.out.println("이탈리아로 가는 여행이 1건이라도 있는지");
        boolean italy = bookings.stream()
                .anyMatch(booking -> booking.getDestination().getCountry().equalsIgnoreCase("Italy"));
        System.out.println("italy = " + italy);

        //Paris'로 예약된 모든 여행자를 찾아 이름순으로 오름차순 정렬하여 출력하세요. (중복된 여행자는 한 번만 나오게 하세요.)
        System.out.println("파리로 예약된 여향자를 찾아 오름차순 중복제거");
        bookings.stream()
                .filter(booking -> booking.getDestination().getCity().equalsIgnoreCase("paris"))
                .map(booking1 -> booking1.getTraveler())
                .distinct()
                .sorted(Comparator.comparing(traveler -> traveler.getName()))
                .forEach(System.out::println);

        // 프랑스(France)로 가는 모든 여행의 총 가격 합계를 계산하세요.
        System.out.println("프랑스로 가는 여행의 총가격");
        Double france = bookings.stream()
                .filter(booking -> booking.getDestination().getCountry().equalsIgnoreCase("france"))
                .map(booking -> booking.getPrice())
                .reduce((double) 0, (a, b) -> a + b);
        System.out.println("france = " + france);


        // 모든 예약 중 최고 가격을 찾고, 가장 저렴한 여행의 전체 정보를 출력하세요. 모르겟다



        //  모든 예약 중 '가장 낮은 가격'을 찾은 뒤 그 최저가보다 비싼 예약들의 평균 가격을 계산하세요.
//        System.out.println("최저가를 뺀 나머지들의 평균가격");
//        bookings.stream()
//                .mapToDouble(Booking::getPrice)
//                .min()
//


        // 전체 예약 목록을 여행지(City)별로 그룹화하여 Map 형태로 출력하세요. (Key: 도시 이름, Value: 해당 도시의 예약 리스트)





    }
}

