public class Main {
    public static void main(String[] args) {
        String[] words = {
                "television",
                "computer",
                "mouse",
                "phone"
        };

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int inx = (int) (Math.random() * question.length);

                char tmp = question[i];
                question[i] = question[inx];
                question[inx] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>",
                    i+1, new String(question));

            String answer = s.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.printf("맞았습니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.%n%n");
            }
        }
    }
}
