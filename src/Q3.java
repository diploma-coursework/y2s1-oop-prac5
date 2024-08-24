public class Q3 {
    public static void main(String[] args) {
        String title = formatNameCapitalization(args[args.length - 1]);
        String surname = "";
        StringBuilder fullNameBuilder = new StringBuilder();

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].charAt(0) == '[') {
                surname = formatNameCapitalization(args[i].substring(1, args[i].length() - 1));
                fullNameBuilder.append(surname).append(" ");
            }
            fullNameBuilder.append(formatNameCapitalization(args[i])).append(" ");
        }
        String fullName = fullNameBuilder.toString().trim();

        System.out.printf("""
                To: %s
                Wishing you a Merry Christmas, %s %s.
                """,
                fullName, title, surname);
    }

    public static String formatNameCapitalization(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
