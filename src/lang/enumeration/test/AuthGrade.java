package lang.enumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String disc;

    AuthGrade(int level, String disc) {
        this.level = level;
        this.disc = disc;
    }

    public int getLevel() {
        return level;
    }

    public String getDisc() {
        return disc;
    }
}
