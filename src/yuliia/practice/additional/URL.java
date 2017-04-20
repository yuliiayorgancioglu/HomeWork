package yuliia.practice.additional;


public class URL {

    static String URLmethod (int page, String URLaddress){
        return URLaddress.replaceAll("page=[0-9]+", "page="+ page);
    }

    public static void main(String[] args) {
        System.out.println(URLmethod(5,"https://www.amazon.com/s/ref=sr_pg_3?fst=p90x%3A1&rh=i%3Aaps%2Ck%3Aumbrella&page=333&keywords=umbrella&ie="));
    }
}

