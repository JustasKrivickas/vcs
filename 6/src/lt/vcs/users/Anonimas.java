package lt.vcs.users;

import lt.vcs.interfeisai.User;

/**
 * Created by KRIVIJ on 2016-10-20.
 */
public class Anonimas implements User {

    @Override
    public String getName() {
        return "Anonimas";
    }

    @Override
    public String getLasName() {
        return "Anonimas";
    }

    @Override
    public String getEmail() {
        return null;
    }
}
