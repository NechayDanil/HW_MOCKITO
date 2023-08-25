public class Manager {
    private String[] movies = new String[0];

    public void addMoves(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int result;
        if (movies.length < 5) {
            result = movies.length;
        } else {
            result = 5;
        }
        String[] ans = new String[result];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
