public class Version implements Comparable<Version>
{
    private String value;

    public Version(String s) {
        this.value = s;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Version o) {
        String[] s1 = this.value.split("\\.");
        String[] s2 = o.value.split("\\.");
        int maxLength = Math.max(s1.length, s2.length);

        for (int i = 0; i < maxLength; ++i){
            int v1 = (i < s1.length) ? Integer.parseInt(s1[i]) : 0;
            int v2 = (i < s2.length) ? Integer.parseInt(s2[i]) : 0;

            if (v1 < v2)
                return -1;
            else if (v1 > v2)
                return 1;
        }
        return 0;
    }
}
