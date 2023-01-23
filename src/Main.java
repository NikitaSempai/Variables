public class Main {
    public static void main(String[] args)
    {
        allTask();
    }

    public static void allTask(){
        System.out.println("----First task----");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog variable: " + dog + "\nCat variable: " + cat + "\nPaper variable: " + paper);
        System.out.println("----Second task----");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Dog variable: " + dog + "\nCat variable: " + cat + "\nPaper variable: " + paper);
        System.out.println("----Third task----");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Dog variable: " + dog + "\nCat variable: " + cat + "\nPaper variable: " + paper);
        System.out.println("----Fourth task----");
        var friend = 19;
        System.out.println("Friend variable: " + friend);
        friend += 2;
        System.out.println("Friend variable: " + friend);
        friend /= 7;
        System.out.println("Friend variable: " + friend);
        System.out.println("----Fifth task----");
        var frog = 3.5;
        System.out.println("Frog variable: " + frog);
        frog *= 10;
        System.out.println("Frog variable: " + frog);
        frog /= 3.5;
        System.out.println("Frog variable: " + frog);
        frog += 4;
        System.out.println("Frog variable: " + frog);
        System.out.println("----Sixth task----");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        System.out.println("Общий вес двух бойцов: " + firstWeight + secondWeight);
        System.out.println("Разница между весами бойцов: " + (secondWeight - firstWeight));
        System.out.println("----Seventh task----");
        System.out.println("Разница между весами бойцов(вычитание): " + (secondWeight - firstWeight) + "\nРазница между весами бойцов(остаток от деления): " + secondWeight % firstWeight);
        System.out.println("----Eighth task----");
        System.out.println("----Part one----");
        var allHours = 640;
        var timeWork = 8;
        var result = allHours/timeWork;
        System.out.println("Всего работников в компании - " + result + " человек");
        System.out.println("----Part two----");
        var persons = result + 94;
        var newAllHours = persons * 8;
        System.out.println("Если в компании работает " + persons + " человек, то всего " + newAllHours + " часов работы может быть поделено между сотрудниками");
    }
}