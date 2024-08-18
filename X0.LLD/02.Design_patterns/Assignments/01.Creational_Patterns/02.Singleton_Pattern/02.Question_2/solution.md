```java

// handle settings like theme and language
interface ThemeManager{
    void setTheme(String theme);
    String getTheme();
}

interface LanguageManager{
    void setLanguage(String language);
    String getLanguage();
}


class SimpleThemeManager implements ThemeManager{
    String theme;

    @Override
    public void setTheme(String theme){
        this.theme = theme;
    }

    @Override
    public String getTheme(){
        return this.theme;
    }

}

class SimpleLanguageManager implements LanguageManager{
    String language;

    @Override
    public void setLanguage(String language){
        this.language  = language;
    }

    @Override
    public String getLanguage(){
      return this.language;
    }
}


class GlobalManager {
    private static GlobalManager instance;

    ThemeManager themeManager;
    LanguageManager languageManager;

    private GlobalManager(ThemeManager themeManager , LanguageManager languageManager){
      this.themeManager = themeManager;
      this.languageManager = languageManager;
    };

    public static GlobalManager getInstance(ThemeManager themeManager , LanguageManager languageManager){
        if(instance==null){
            synchronized (GlobalManager.class){
                 if(instance==null)
                    instance = new GlobalManager(themeManager , languageManager);
            }
        }
        return instance;
    }

    public void setTheme(String theme){
        themeManager.setTheme(theme);
    }

    public void setLanguage(String language){
        languageManager.setLanguage(language);
    }

    public String getTheme(){
      return themeManager.getTheme();
    }

    public String getLanguage(){
      return languageManager.getLanguage();
    }

}

public class Main
{
    public static void main(String[] args) {
       ThemeManager themeManager = new SimpleThemeManager();
       LanguageManager languageManager = new SimpleLanguageManager();

       GlobalManager manager1 = GlobalManager.getInstance(themeManager, languageManager);
       manager1.setTheme("dark");
       manager1.setLanguage("english");

      // this should refer to same object as only one instance can be created
       GlobalManager manager2 = GlobalManager.getInstance(themeManager, languageManager);
       System.out.println("Theme saved => " + manager2.getTheme());
       System.out.println("Theme saved => " + manager2.getLanguage());
    }
}
```
