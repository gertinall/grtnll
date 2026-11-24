package semester1.practice07;

public class practice07{
    public static void main(String[] args){
        Book book1=new Book();
        Book book2=new Book("Кобзар","Тарас Шевченко",1840,250.0);
        Book book3=new Book("Тіні забутих предків","Михайло Коцюбинський",-5,100.0);
        System.out.println();
        System.out.println("Завдання 1.");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        Student student1=new Student("Олена",19,4.8);
        Student student2=new Student("Максим",120,3.7);
        Student student3=new Student("Ірина",20,7.5);
        System.out.println();
        System.out.println("Завдання 2.");
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();

        BankAccount account=new BankAccount("UA001","Іван Петренко",1000.0);
        System.out.println();
        System.out.println("Завдання 3.");
        account.printAccount();
        account.deposit(500.0);
        account.printAccount();
        System.out.println("Зняття 5000: "+account.withdraw(5000.0));
        System.out.println("Зняття 300: "+account.withdraw(300.0));
        account.printAccount();

        Point2D origin=new Point2D();
        Point2D point=new Point2D(3.0,4.0);
        System.out.println();
        System.out.println("Завдання 4.");
        origin.printPoint();
        point.printPoint();
        System.out.println("Відстань до початку координат: "+point.distanceToOrigin());
        System.out.println("Відстань від (0; 0) до (6; 8): "+origin.distanceTo(6.0,8.0));
        System.out.println("Відстань від (3; 4) до (6; 8): "+point.distanceTo(6.0,8.0));

        Product product=new Product("Ноутбук",30000.0,5,"Електроніка");
        System.out.println();
        System.out.println("Завдання 5.");
        product.printProduct();
        product.applyDiscount(20.0);
        product.printProduct();
        product.applyDiscount(150.0);

        Time time=new Time(23,59,58);
        System.out.println();
        System.out.println("Завдання 6.");
        for(int i=0;i<4;i++){
            System.out.println(time.toUniversalString()+" | "+time.toStandardString());
            time.tick();
        }
        System.out.println(time.toUniversalString()+" | "+time.toStandardString());

        Rectangle rectangle=new Rectangle(4.0,6.0);
        Rectangle square=new Rectangle(5.0);
        Rectangle unit=new Rectangle();
        System.out.println();
        System.out.println("Завдання 7.");
        System.out.println("Прямокутник: площа "+rectangle.getArea()+", периметр "+rectangle.getPerimeter()+", квадрат: "+rectangle.isSquare());
        System.out.println("Квадрат: площа "+square.getArea()+", периметр "+square.getPerimeter()+", квадрат: "+square.isSquare());
        System.out.println("Одиничний: площа "+unit.getArea()+", периметр "+unit.getPerimeter()+", квадрат: "+unit.isSquare());
        System.out.println("Площа прямокутника більша за площу квадрата: "+(rectangle.getArea()>square.getArea()));

        Employee employee=new Employee(1,"Коваленко Андрій Петрович","Програміст",40000.0);
        System.out.println();
        System.out.println("Завдання 8.");
        employee.printBadge();
        System.out.println("Річний дохід: "+employee.getAnnualSalary());
        employee.raiseSalary(15.0);
        employee.printBadge();
        System.out.println("Новий річний дохід: "+employee.getAnnualSalary());

        User user1=new User("alex","alex@mail.com","ADMIN",false);
        User user2=new User("olena","olena@mail.com");
        User user3=new User("maksym");
        User user4=new User();
        System.out.println();
        System.out.println("Завдання 9.");
        user1.printProfile();
        user2.printProfile();
        user3.printProfile();
        user4.printProfile();

        Fraction fraction1=new Fraction(6,-8);
        Fraction fraction2=new Fraction(5);
        Fraction fraction3=new Fraction();
        Fraction fraction4=new Fraction(3,0);
        System.out.println();
        System.out.println("Завдання 10.");
        fraction1.print();
        System.out.println(fraction1.toDouble());
        fraction2.print();
        fraction3.print();
        fraction4.print();

        Car carTask11=new Car("Toyota","Camry",2024);
        Car defaultCar=new Car();
        System.out.println();
        System.out.println("Завдання 11.");
        carTask11.printCar();
        carTask11.drive(150.0);
        carTask11.startEngine();
        carTask11.drive(150.0);
        carTask11.stopEngine();
        carTask11.printCar();
        defaultCar.printCar();

        SmartBulb bulb1=new SmartBulb(80,3000,false);
        SmartBulb bulb2=new SmartBulb(120,9000,true);
        SmartBulb bulb3=new SmartBulb(30);
        SmartBulb bulb4=new SmartBulb();
        System.out.println();
        System.out.println("Завдання 12.");
        bulb1.printStatus();
        bulb2.printStatus();
        bulb3.printStatus();
        bulb4.printStatus();

        String sql1=new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
        String sql2=new QueryBuilder("orders").build();
        System.out.println();
        System.out.println("Завдання 13.");
        System.out.println(sql1);
        System.out.println(sql2);

        CoffeeOrder order1Task14=new CoffeeOrder("Лате","Large",2,true);
        CoffeeOrder order2Task14=new CoffeeOrder("Капучино","Small");
        CoffeeOrder order3=new CoffeeOrder("Еспресо");
        System.out.println();
        System.out.println("Завдання 14.");
        order1Task14.printReceipt();
        order2Task14.printReceipt();
        order3.printReceipt();

        Box cube=new Box(3.0,"Картон");
        Box copy=new Box(cube);
        System.out.println();
        System.out.println("Завдання 15.");
        cube.printBox();
        copy.printBox();
        System.out.println("Об'єми однакові: "+(cube.getVolume()==copy.getVolume()));
        System.out.println("Це один і той самий об'єкт: "+(cube==copy));

        FlightTicket ticket=new FlightTicket("T-1001","Іван Петренко","PS101","Київ","Львів");
        System.out.println();
        System.out.println("Завдання 16.");
        ticket.printBoardingPass();
        ticket.assignSeat("12A");
        ticket.printBoardingPass();

        MathOperations math=new MathOperations();
        System.out.println();
        System.out.println("Завдання 17.");
        System.out.println(math.add(2,3));
        System.out.println(math.add(2.5,3.5));
        System.out.println(math.add(1,2,3));
        System.out.println(math.add("Hello","world"));
        System.out.println(math.multiply(4,5));
        System.out.println(math.multiply(1.5,4.0));
        System.out.println(math.multiply("ab",3));

        DocumentPrinter printer=new DocumentPrinter();
        String[] lines={"Перший рядок","Другий рядок","Третій рядок"};
        System.out.println();
        System.out.println("Завдання 18.");
        printer.print("Звичайний рядок");
        printer.print(123);
        printer.print(3.14159,2);
        printer.print(lines);
        printer.print("великі літери",true);
        printer.print("Без змін",false);

        AreaCalculator calculator=new AreaCalculator();
        System.out.println();
        System.out.println("Завдання 19.");
        System.out.println("Квадрат: "+calculator.calculateArea(5.0));
        System.out.println("Прямокутник: "+calculator.calculateArea(4.0,6.0));
        System.out.println("Коло: "+calculator.calculateArea(2.0,true));
        System.out.println("Трикутник: "+calculator.calculateArea(3.0,4.0,5.0));
        System.out.println("Трапеція: "+calculator.calculateArea(4.0,6.0,3.0,true));

        Logger logger=new Logger();
        System.out.println();
        System.out.println("Завдання 20.");
        logger.log("Програму запущено");
        logger.log("WARN","Мало вільної пам'яті");
        logger.log("ERROR",404,"Ресурс не знайдено");
        logger.log("TIME","Подія з міткою часу",true);

        ArraySearcher searcher=new ArraySearcher();
        int[] numbersTask21={4,8,15,16,23,42,8};
        String[] words={"Java","Python","C++"};
        System.out.println();
        System.out.println("Завдання 21.");
        System.out.println(searcher.find(numbersTask21,8));
        System.out.println(searcher.find(numbersTask21,8,2));
        System.out.println(searcher.find(numbersTask21,100));
        System.out.println(searcher.find(words,"Python"));
        System.out.println(searcher.find(words,"python"));
        System.out.println(searcher.find(words,"python",true));

        DateService date=new DateService(15,3,2024);
        System.out.println();
        System.out.println("Завдання 22.");
        date.printDate();
        date.add(20);
        date.printDate();
        date.add(0,3);
        date.printDate();
        date.add(10,1,1);
        date.printDate();

        SalaryCalculator salary=new SalaryCalculator();
        System.out.println();
        System.out.println("Завдання 23.");
        System.out.println("Лише ставка: "+salary.calculate(20000.0));
        System.out.println("Ставка + премія: "+salary.calculate(20000.0,3000.0));
        System.out.println("Ставка + 10% без податку: "+salary.calculate(20000.0,10.0,false));
        System.out.println("Ставка + 10% з податком: "+salary.calculate(20000.0,10.0,true));
        System.out.println("Ставка + понаднормові: "+salary.calculate(20000.0,8,150.0));

        ArrayFilter filter=new ArrayFilter();
        int[] numbersTask24={12,5,8,19,24,3,16};
        int[] result;
        System.out.println();
        System.out.println("Завдання 24.");
        result=filter.filter(numbersTask24,10);
        System.out.println("Більші за 10:");
        for(int number:result){
            System.out.println(number);
        }
        result=filter.filter(numbersTask24,5,16);
        System.out.println("У діапазоні [5; 16]:");
        for(int number:result){
            System.out.println(number);
        }
        result=filter.filter(numbersTask24,true);
        System.out.println("Парні:");
        for(int number:result){
            System.out.println(number);
        }
        result=filter.filter(numbersTask24,false);
        System.out.println("Непарні:");
        for(int number:result){
            System.out.println(number);
        }

        UserAccount account1;
        UserAccount account2;
        UserAccount account3;
        System.out.println();
        System.out.println("Завдання 25.");
        System.out.println("Наступний ID: "+UserAccount.getNextAvailableId());
        account1=new UserAccount("olena","olena@mail.com");
        account2=new UserAccount("maksym","maksym@mail.com");
        account3=new UserAccount("iryna","iryna@mail.com");
        account1.printAccount();
        account2.printAccount();
        account3.printAccount();
        System.out.println("Наступний ID: "+UserAccount.getNextAvailableId());
        UserAccount.resetIdSequence(5000);
        System.out.println("Після скидання: "+UserAccount.getNextAvailableId());

        System.out.println();
        System.out.println("Завдання 26.");
        System.out.println("Сервер: "+ServerConfig.SERVER_NAME+", максимум підключень: "+ServerConfig.MAX_CONNECTIONS);
        for(int i=1;i<=6;i++){
            if(ServerConfig.connect()){
                System.out.println("Користувач "+i+" підключився");
            }else{
                System.out.println("Користувачу "+i+" відмовлено: ліміт вичерпано");
            }
        }
        ServerConfig.printServerStatus();
        ServerConfig.disconnect();
        ServerConfig.printServerStatus();

        System.out.println();
        System.out.println("Завдання 27.");
        System.out.println("PI = "+MathUtils.PI+", E = "+MathUtils.E);
        System.out.println("5! = "+MathUtils.factorial(5));
        System.out.println("2^10 = "+MathUtils.power(2.0,10));
        System.out.println("2^-3 = "+MathUtils.power(2.0,-3));
        System.out.println("НСД(48, 18) = "+MathUtils.gcd(48,18));
        System.out.println("clamp(15, 0, 10) = "+MathUtils.clamp(15,0,10));
        System.out.println("clamp(-5, 0, 10) = "+MathUtils.clamp(-5,0,10));

        System.out.println();
        System.out.println("Завдання 28.");
        System.out.println("100 USD = "+CurrencyExchange.usdToUah(100.0)+" UAH");
        System.out.println("100 EUR = "+CurrencyExchange.eurToUah(100.0)+" UAH");
        System.out.println("4150 UAH = "+CurrencyExchange.uahToUsd(4150.0)+" USD");
        CurrencyExchange.updateRates(42.0,46.0);
        System.out.println("Після оновлення курсу:");
        System.out.println("100 USD = "+CurrencyExchange.usdToUah(100.0)+" UAH");
        System.out.println("100 EUR = "+CurrencyExchange.eurToUah(100.0)+" UAH");
        System.out.println("4200 UAH = "+CurrencyExchange.uahToUsd(4200.0)+" USD");

        FleetCar car1=new FleetCar("VIN-001",10000.0);
        FleetCar car2=new FleetCar("VIN-002",25000.0);
        FleetCar car3=new FleetCar("VIN-003",0.0);
        System.out.println();
        System.out.println("Завдання 29.");
        FleetCar.printFleetSummary();
        car1.addTrip(120.0);
        car2.addTrip(300.0);
        car3.addTrip(50.0);
        car1.printCar();
        car2.printCar();
        car3.printCar();
        FleetCar.printFleetSummary();

        System.out.println();
        System.out.println("Завдання 30.");
        System.out.println(StringUtils.isPalindrome("А роза упала на лапу Азора"));
        System.out.println(StringUtils.isPalindrome("Hello"));
        System.out.println(StringUtils.reverse("Java"));
        System.out.println(StringUtils.countVowels("Programming"));
        System.out.println(StringUtils.maskCardNumber("1234567812345678"));

        GameSession session1=GameSession.createSession("Alex");
        GameSession session2=GameSession.createSession("Olena");
        GameSession session3=GameSession.createSession("Maksym");
        GameSession session4=GameSession.createSession("Iryna");
        GameSession session5;
        System.out.println();
        System.out.println("Завдання 31.");
        System.out.println("Четверта сесія: "+session4);
        session1.printSession();
        session1.terminate();
        session1.printSession();
        session5=GameSession.createSession("Iryna");
        session5.printSession();

        System.out.println();
        System.out.println("Завдання 32.");
        System.out.println("Енергія спокою 1 г: "+PhysicsEngine.restEnergy(0.001)+" Дж");
        System.out.println("Відстань падіння за 5 с: "+PhysicsEngine.freeFallDistance(5.0)+" м");
        System.out.println("Кінетична енергія (2 кг, 10 м/с): "+PhysicsEngine.kineticEnergy(2.0,10.0)+" Дж");

        LineSegment segment=new LineSegment(0.0,0.0,6.0,8.0);
        Point middle=segment.getMidPoint();
        System.out.println();
        System.out.println("Завдання 33.");
        segment.printSegment();
        System.out.println("Довжина: "+segment.getLength());
        System.out.println("Середина: ("+middle.getX()+"; "+middle.getY()+")");

        ClientAccount ivan=new ClientAccount("UA01","Іван",10000.0);
        ClientAccount maria=new ClientAccount("UA02","Марія",2000.0);
        System.out.println();
        System.out.println("Завдання 34.");
        System.out.println("Переказ 3500: "+ivan.transferTo(maria,3500.0));
        System.out.println("Переказ самому собі: "+ivan.transferTo(ivan,100.0));
        System.out.println("Переказ 50000: "+ivan.transferTo(maria,50000.0));
        ivan.printAccount();
        maria.printAccount();

        Engine engine=new Engine("ENG-777",250);
        CarWithEngine carTask35=new CarWithEngine("BMW","M5",engine);
        System.out.println();
        System.out.println("Завдання 35.");
        carTask35.printSpecs();
        carTask35.startCar();
        carTask35.printSpecs();
        carTask35.turnOff();
        carTask35.printSpecs();

        Processor cpu=new Processor("Intel Core i7",3.6,12000.0);
        Memory ram16=new Memory(16,3200,2500.0);
        Memory ram32=new Memory(32,3600,5200.0);
        Computer computer=new Computer("Gaming PC",cpu,ram16,6000.0);
        System.out.println();
        System.out.println("Завдання 36.");
        computer.printSpecs();
        System.out.println("Ціна: "+computer.calculateTotalPrice());
        computer.upgradeMemory(ram32);
        computer.printSpecs();
        System.out.println("Нова ціна: "+computer.calculateTotalPrice());

        Hero knight=new Hero("Лицар",100,18,5);
        Hero orc=new Hero("Орк",120,15,3);
        int round=1;
        System.out.println();
        System.out.println("Завдання 37.");
        while(knight.isAlive()&&orc.isAlive()){
            System.out.println("Раунд "+round);
            knight.attack(orc);
            if(orc.isAlive()){
                orc.attack(knight);
            }
            round++;
        }
        if(knight.isAlive()){
            System.out.println("Переможець: "+knight.getName());
        }else{
            System.out.println("Переможець: "+orc.getName());
        }

        Customer rich=new Customer("Поліна",50000.0);
        Customer poor=new Customer("Демид",500.0);
        ShopProduct phone=new ShopProduct(1,"Смартфон",20000.0);
        ShopProduct headphones=new ShopProduct(2,"Навушники",2500.0);
        ShopProduct cable=new ShopProduct(3,"Кабель",300.0);
        Order order1Task38=new Order(rich,5);
        Order order2Task38=new Order(poor,5);
        System.out.println();
        System.out.println("Завдання 38.");
        order1Task38.addProduct(phone);
        order1Task38.addProduct(headphones);
        order1Task38.addProduct(cable);
        order2Task38.addProduct(phone);
        order2Task38.addProduct(cable);
        System.out.println("Оплата замовлення Поліни: "+order1Task38.checkout());
        System.out.println("Оплата замовлення Демида: "+order2Task38.checkout());

        Vector3D vectorA=new Vector3D(1,0,0);
        Vector3D vectorB=new Vector3D(0,1,0);
        Vector3D zero=new Vector3D();
        System.out.println();
        System.out.println("Завдання 39.");
        System.out.println("A + B = "+vectorA.add(vectorB));
        System.out.println("A · B = "+vectorA.dotProduct(vectorB));
        System.out.println("A × B = "+vectorA.crossProduct(vectorB));
        System.out.println("A перпендикулярний B: "+vectorA.isOrthogonalTo(vectorB));
        System.out.println("A дорівнює B: "+vectorA.isEqualTo(vectorB));
        System.out.println("Нульовий вектор: "+zero);

        LibraryCatalog catalog=new LibraryCatalog(5);
        System.out.println();
        System.out.println("Завдання 40.");
        catalog.addBook(new BookItem("978-1","Кобзар","Тарас Шевченко"));
        catalog.addBook(new BookItem("978-2","Лісова пісня","Леся Українка"));
        catalog.addBook(new BookItem("978-3","Intermezzo","Михайло Коцюбинський"));
        catalog.printCatalog();
        System.out.println("Беремо \"Кобзар\": "+catalog.borrowBook("Кобзар"));
        catalog.printCatalog();
        System.out.println("Беремо \"Кобзар\" вдруге: "+catalog.borrowBook("Кобзар"));
        System.out.println("Беремо неіснуючу книгу: "+catalog.borrowBook("Енеїда"));
    }
}

class AreaCalculator{
    public double calculateArea(double side){
        return side*side;
    }

    public double calculateArea(double width,double height){
        return width*height;
    }

    public double calculateArea(double radius,boolean isCircle){
        return Math.PI*radius*radius;
    }

    public double calculateArea(double a,double b,double c){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double calculateArea(double base1,double base2,double height,boolean isTrapezoid){
        return (base1+base2)/2*height;
    }
}

class ArrayFilter{
    public int[] filter(int[] arr,int threshold){
        int count=0;
        int index=0;
        int[] result;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>threshold){
                count++;
            }
        }
        result=new int[count];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>threshold){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }

    public int[] filter(int[] arr,int min,int max){
        int count=0;
        int index=0;
        int[] result;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=min&&arr[i]<=max){
                count++;
            }
        }
        result=new int[count];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=min&&arr[i]<=max){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }

    public int[] filter(int[] arr,boolean keepEvens){
        int count=0;
        int index=0;
        int[] result;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2==0)==keepEvens){
                count++;
            }
        }
        result=new int[count];
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2==0)==keepEvens){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }
}

class ArraySearcher{
    public int find(int[] arr,int target){
        return find(arr,target,0);
    }

    public int find(int[] arr,int target,int startIndex){
        for(int i=startIndex;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public int find(String[] arr,String target){
        return find(arr,target,false);
    }

    public int find(String[] arr,String target,boolean ignoreCase){
        for(int i=0;i<arr.length;i++){
            if(ignoreCase){
                if(arr[i].equalsIgnoreCase(target)){
                    return i;
                }
            }else if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}

class BankAccount{
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber,String ownerName,double initialBalance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        if(initialBalance<0){
            this.balance=0.0;
        }else{
            this.balance=initialBalance;
        }
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
        }
    }

    public boolean withdraw(double amount){
        if(amount<=0||amount>this.balance){
            return false;
        }
        this.balance-=amount;
        return true;
    }

    public void printAccount(){
        System.out.println("Рахунок: "+accountNumber+", власник: "+ownerName+", баланс: "+balance);
    }
}

class Book{
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(){
        this.title="Невідомо";
        this.author="Невідомий";
        this.year=2000;
        this.price=0.0;
    }

    public Book(String title,String author,int year,double price){
        this.title=title;
        this.author=author;
        if(year<0||price<0.0){
            this.year=2000;
            this.price=0.0;
        }else{
            this.year=year;
            this.price=price;
        }
    }

    public void printInfo(){
        System.out.println("Книга: "+title+", автор: "+author+", рік: "+year+", ціна: "+price);
    }
}

class BookItem{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public BookItem(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }

    public void borrowBook(){
        isAvailable=false;
    }

    public void returnBook(){
        isAvailable=true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public void printBook(){
        String status=isAvailable?"у наявності":"видана";
        System.out.println("["+isbn+"] "+title+" - "+author+" ("+status+")");
    }
}

class Box{
    private double width;
    private double height;
    private double depth;
    private String material;

    public Box(double width,double height,double depth,String material){
        this.width=width;
        this.height=height;
        this.depth=depth;
        this.material=material;
    }

    public Box(double size,String material){
        this(size,size,size,material);
    }

    public Box(Box other){
        this(other.width,other.height,other.depth,other.material);
    }

    public double getVolume(){
        return width*height*depth;
    }

    public double getSurfaceArea(){
        return 2*(width*height+width*depth+height*depth);
    }

    public void printBox(){
        System.out.println("Коробка "+width+"x"+height+"x"+depth+" ("+material+"), об'єм: "+getVolume()+", площа поверхні: "+getSurfaceArea());
    }
}

class Car{
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public Car(String brand,String model,int year,double mileage){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
        this.engineStarted=false;
    }

    public Car(String brand,String model,int year){
        this(brand,model,year,0.0);
    }

    public Car(){
        this("Unknown","Standard",2024);
    }

    public void startEngine(){
        engineStarted=true;
        System.out.println("Двигун заведено");
    }

    public void stopEngine(){
        engineStarted=false;
        System.out.println("Двигун заглушено");
    }

    public void drive(double distance){
        if(engineStarted){
            mileage+=distance;
        }else{
            System.out.println("Спершу заведіть двигун!");
        }
    }

    public void printCar(){
        System.out.println(brand+" "+model+" ("+year+"), пробіг: "+mileage+" км");
    }
}

class CarWithEngine{
    private String brand;
    private String model;
    private Engine engine;

    public CarWithEngine(String brand,String model,Engine engine){
        this.brand=brand;
        this.model=model;
        this.engine=engine;
    }

    public void startCar(){
        this.engine.start();
        System.out.println(brand+" готовий до руху!");
    }

    public void turnOff(){
        this.engine.stop();
    }

    public void printSpecs(){
        System.out.println("Авто: "+brand+" "+model+", потужність двигуна: "+engine.getHorsePower()+" к.с., двигун працює: "+engine.isRunning());
    }
}

class ClientAccount{
    private String iban;
    private String owner;
    private double balance;

    public ClientAccount(String iban,String owner,double balance){
        this.iban=iban;
        this.owner=owner;
        this.balance=balance;
    }

    public boolean transferTo(ClientAccount recipient,double amount){
        if(recipient==null||recipient==this){
            return false;
        }
        if(amount<=0||this.balance<amount){
            return false;
        }
        this.balance-=amount;
        recipient.balance+=amount;
        return true;
    }

    public void printAccount(){
        System.out.println("Рахунок "+iban+", власник: "+owner+", баланс: "+balance+" грн");
    }
}

class CoffeeOrder{
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    public CoffeeOrder(String type,String size,int sugarCount,boolean withSyrup){
        this.type=type;
        this.size=size;
        this.sugarCount=sugarCount;
        this.withSyrup=withSyrup;
        this.finalPrice=calculatePrice();
    }

    public CoffeeOrder(String type,String size){
        this(type,size,0,false);
    }

    public CoffeeOrder(String type){
        this(type,"Medium");
    }

    private double calculatePrice(){
        double base=0.0;
        double coefficient=1.0;
        double result;
        if(type.equals("Еспресо")){
            base=40;
        }else if(type.equals("Капучино")){
            base=55;
        }else if(type.equals("Лате")){
            base=60;
        }
        if(size.equals("Medium")){
            coefficient=1.3;
        }else if(size.equals("Large")){
            coefficient=1.6;
        }
        result=base*coefficient;
        if(withSyrup){
            result+=15;
        }
        return result;
    }

    public void printReceipt(){
        System.out.println("Чек: "+type+", розмір: "+size+", цукор: "+sugarCount+", сироп: "+withSyrup+", до сплати: "+finalPrice+" грн");
    }
}

class Computer{
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title,Processor cpu,Memory ram,double casePrice){
        this.title=title;
        this.cpu=cpu;
        this.ram=ram;
        this.casePrice=casePrice;
    }

    public double calculateTotalPrice(){
        return cpu.getPrice()+ram.getPrice()+casePrice;
    }

    public void upgradeMemory(Memory newRam){
        System.out.println("Апгрейд пам'яті: "+ram.getSizeGB()+" GB -> "+newRam.getSizeGB()+" GB");
        this.ram=newRam;
    }

    public void printSpecs(){
        System.out.println("ПК "+title+": "+cpu.getModel()+" ("+cpu.getFrequencyGHz()+" GHz), "+ram.getSizeGB()+" GB "+ram.getFrequencyMHz()+" MHz, ціна: "+calculateTotalPrice()+" грн");
    }
}

class CurrencyExchange{
    private static double usdToUahRate=41.5;
    private static double eurToUahRate=45.2;

    public static void updateRates(double newUsd,double newEur){
        if(newUsd>0){
            usdToUahRate=newUsd;
        }
        if(newEur>0){
            eurToUahRate=newEur;
        }
    }

    public static double uahToUsd(double uah){
        return uah/usdToUahRate;
    }

    public static double usdToUah(double usd){
        return usd*usdToUahRate;
    }

    public static double eurToUah(double eur){
        return eur*eurToUahRate;
    }
}

class Customer{
    private String name;
    private double walletBalance;

    public Customer(String name,double walletBalance){
        this.name=name;
        this.walletBalance=walletBalance;
    }

    public boolean pay(double amount){
        if(amount>this.walletBalance){
            return false;
        }
        this.walletBalance-=amount;
        return true;
    }

    public String getName(){
        return name;
    }

    public double getWalletBalance(){
        return walletBalance;
    }
}

class DateService{
    private int day;
    private int month;
    private int year;

    public DateService(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void add(int days){
        add(days,0,0);
    }

    public void add(int days,int months){
        add(days,months,0);
    }

    public void add(int days,int months,int years){
        day+=days;
        month+=months;
        year+=years;
        while(day>30){
            day-=30;
            month++;
        }
        while(month>12){
            month-=12;
            year++;
        }
    }

    public void printDate(){
        String d=day<10?"0"+day:""+day;
        String m=month<10?"0"+month:""+month;
        System.out.println(d+"."+m+"."+year);
    }
}

class DocumentPrinter{
    public void print(String message){
        System.out.println(message);
    }

    public void print(int number){
        System.out.println("[INT]: "+number);
    }

    public void print(double number,int decimals){
        System.out.println(String.format("%."+decimals+"f",number));
    }

    public void print(String[] lines){
        for(int i=0;i<lines.length;i++){
            System.out.println((i+1)+". "+lines[i]);
        }
    }

    public void print(String message,boolean uppercase){
        if(uppercase){
            System.out.println(message.toUpperCase());
        }else{
            System.out.println(message);
        }
    }
}

class Employee{
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id,String fullName,String position,double monthlySalary){
        this.id=id;
        this.fullName=fullName;
        this.position=position;
        this.monthlySalary=monthlySalary;
    }

    public void raiseSalary(double percent){
        this.monthlySalary+=this.monthlySalary*percent/100;
    }

    public double getAnnualSalary(){
        return 12*monthlySalary;
    }

    public void printBadge(){
        System.out.println("[#"+id+"] "+fullName+" | "+position+" | ставка: "+monthlySalary);
    }
}

class Engine{
    private String serialNumber;
    private int horsePower;
    private boolean isRunning;

    public Engine(String serialNumber,int horsePower){
        this.serialNumber=serialNumber;
        this.horsePower=horsePower;
        this.isRunning=false;
    }

    public void start(){
        isRunning=true;
        System.out.println("Двигун "+serialNumber+" запущено");
    }

    public void stop(){
        isRunning=false;
        System.out.println("Двигун "+serialNumber+" зупинено");
    }

    public boolean isRunning(){
        return isRunning;
    }

    public int getHorsePower(){
        return horsePower;
    }
}

class FleetCar{
    private static int totalCars=0;
    private static double totalCompanyMileage=0.0;

    private String vinCode;
    private double currentMileage;

    public FleetCar(String vinCode,double initialMileage){
        this.vinCode=vinCode;
        this.currentMileage=initialMileage;
        totalCars++;
        totalCompanyMileage+=initialMileage;
    }

    public void addTrip(double km){
        this.currentMileage+=km;
        totalCompanyMileage+=km;
    }

    public void printCar(){
        System.out.println("Авто "+vinCode+", пробіг: "+currentMileage+" км");
    }

    public static void printFleetSummary(){
        System.out.println("Автопарк: авто "+totalCars+", загальний пробіг "+totalCompanyMileage+" км");
    }
}

class FlightTicket{
    private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    public FlightTicket(String ticketNumber,String passengerName,String flightNumber,String departureCity,String arrivalCity,String seatNumber,boolean hasBaggage){
        this.ticketNumber=ticketNumber;
        this.passengerName=passengerName;
        this.flightNumber=flightNumber;
        this.departureCity=departureCity;
        this.arrivalCity=arrivalCity;
        this.seatNumber=seatNumber;
        this.hasBaggage=hasBaggage;
    }

    public FlightTicket(String ticketNumber,String passengerName,String flightNumber,String departureCity,String arrivalCity){
        this(ticketNumber,passengerName,flightNumber,departureCity,arrivalCity,"UNASSIGNED",false);
    }

    public void assignSeat(String seat){
        this.seatNumber=seat;
    }

    public void printBoardingPass(){
        System.out.println("Посадковий талон №"+ticketNumber);
        System.out.println("Пасажир: "+passengerName);
        System.out.println("Рейс: "+flightNumber+" ("+departureCity+" -> "+arrivalCity+")");
        System.out.println("Місце: "+seatNumber+", багаж: "+hasBaggage);
    }
}

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        int divisor;
        if(denominator==0){
            System.out.println("Помилка: знаменник не може бути нулем!");
            denominator=1;
        }
        if(denominator<0){
            numerator=-numerator;
            denominator=-denominator;
        }
        divisor=gcd(Math.abs(numerator),denominator);
        this.numerator=numerator/divisor;
        this.denominator=denominator/divisor;
    }

    public Fraction(int wholeNumber){
        this(wholeNumber,1);
    }

    public Fraction(){
        this(0,1);
    }

    private static int gcd(int a,int b){
        while(b!=0){
            int rest=a%b;
            a=b;
            b=rest;
        }
        return a;
    }

    public void print(){
        if(denominator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    public double toDouble(){
        return (double)numerator/denominator;
    }
}

class GameSession{
    private static int activeSessionsCount=0;
    private static int createdSessions=0;
    public static final int MAX_SESSIONS=3;

    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private GameSession(String host){
        createdSessions++;
        this.sessionToken="SES-"+createdSessions;
        this.hostPlayer=host;
        this.isActive=true;
    }

    public static GameSession createSession(String host){
        if(activeSessionsCount>=MAX_SESSIONS){
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new GameSession(host);
    }

    public void terminate(){
        if(isActive){
            isActive=false;
            activeSessionsCount--;
        }
    }

    public void printSession(){
        System.out.println("Сесія "+sessionToken+", хост: "+hostPlayer+", активна: "+isActive);
    }
}

class Hero{
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name,int health,int attackPower,int defense){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.defense=defense;
    }

    public void attack(Hero target){
        int damage=this.attackPower-target.defense;
        if(damage<=0){
            damage=1;
        }
        target.health-=damage;
        if(target.health<0){
            target.health=0;
        }
        System.out.println(this.name+" б'є "+target.name+" на "+damage+". У "+target.name+" залишилось "+target.health+" HP");
    }

    public boolean isAlive(){
        return this.health>0;
    }

    public String getName(){
        return name;
    }
}

class LibraryCatalog{
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity){
        this.books=new BookItem[capacity];
        this.size=0;
    }

    public void addBook(BookItem book){
        if(size<books.length){
            books[size]=book;
            size++;
        }else{
            System.out.println("Фонд заповнений, книгу не додано: "+book.getTitle());
        }
    }

    public BookItem findBookByTitle(String title){
        for(int i=0;i<size;i++){
            if(books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String title){
        BookItem book=findBookByTitle(title);
        if(book==null){
            System.out.println("Книги \""+title+"\" немає у фонді");
            return false;
        }
        if(!book.isAvailable()){
            System.out.println("Книга \""+title+"\" уже видана");
            return false;
        }
        book.borrowBook();
        return true;
    }

    public void printCatalog(){
        for(int i=0;i<size;i++){
            books[i].printBook();
        }
    }
}

class LineSegment{
    private Point start;
    private Point end;

    public LineSegment(Point start,Point end){
        this.start=start;
        this.end=end;
    }

    public LineSegment(double x1,double y1,double x2,double y2){
        this.start=new Point(x1,y1);
        this.end=new Point(x2,y2);
    }

    public double getLength(){
        double dx=end.getX()-start.getX();
        double dy=end.getY()-start.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }

    public Point getMidPoint(){
        return new Point((start.getX()+end.getX())/2,(start.getY()+end.getY())/2);
    }

    public void printSegment(){
        System.out.println("Відрізок: ("+start.getX()+"; "+start.getY()+") -> ("+end.getX()+"; "+end.getY()+")");
    }
}

class Logger{
    public void log(String message){
        System.out.println("[INFO] "+message);
    }

    public void log(String level,String message){
        System.out.println("["+level+"] "+message);
    }

    public void log(String level,int errorCode,String message){
        System.out.println("["+level+"] (Code: "+errorCode+"): "+message);
    }

    public void log(String tag,String message,boolean timestamp){
        if(timestamp){
            System.out.println("["+tag+"] "+message+" | time: "+System.currentTimeMillis());
        }else{
            System.out.println("["+tag+"] "+message);
        }
    }
}

class MathOperations{
    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public String add(String a,String b){
        return a+" "+b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

    public double multiply(double a,double b){
        return a*b;
    }

    public String multiply(String text,int times){
        String result="";
        for(int i=0;i<times;i++){
            result+=text;
        }
        return result;
    }
}

class MathUtils{
    public static final double PI=3.1415926535;
    public static final double E=2.7182818284;

    private MathUtils(){}

    public static long factorial(int n){
        long result=1;
        if(n<0){
            return -1;
        }
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }

    public static double power(double base,int exp){
        double result=1.0;
        int count=Math.abs(exp);
        for(int i=0;i<count;i++){
            result*=base;
        }
        if(exp<0){
            return 1.0/result;
        }
        return result;
    }

    public static int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int rest=a%b;
            a=b;
            b=rest;
        }
        return a;
    }

    public static int clamp(int val,int min,int max){
        if(val<min){
            return min;
        }
        if(val>max){
            return max;
        }
        return val;
    }
}

class Memory{
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    public Memory(int sizeGB,int frequencyMHz,double price){
        this.sizeGB=sizeGB;
        this.frequencyMHz=frequencyMHz;
        this.price=price;
    }

    public int getSizeGB(){
        return sizeGB;
    }

    public int getFrequencyMHz(){
        return frequencyMHz;
    }

    public double getPrice(){
        return price;
    }
}

class Order{
    private Customer customer;
    private ShopProduct[] items;
    private int itemCount;

    public Order(Customer customer,int maxItems){
        this.customer=customer;
        this.items=new ShopProduct[maxItems];
        this.itemCount=0;
    }

    public void addProduct(ShopProduct p){
        if(itemCount<items.length){
            items[itemCount]=p;
            itemCount++;
        }else{
            System.out.println("Замовлення заповнене, товар не додано: "+p.getTitle());
        }
    }

    public double calculateTotal(){
        double total=0.0;
        for(int i=0;i<itemCount;i++){
            total+=items[i].getPrice();
        }
        return total;
    }

    public boolean checkout(){
        double total=calculateTotal();
        if(this.customer.pay(total)){
            System.out.println("=== Чек для "+customer.getName()+" ===");
            for(int i=0;i<itemCount;i++){
                System.out.println(items[i].getId()+". "+items[i].getTitle()+" - "+items[i].getPrice()+" грн");
            }
            System.out.println("Разом: "+total+" грн, залишок: "+customer.getWalletBalance()+" грн");
            return true;
        }
        System.out.println("Недостатньо коштів у "+customer.getName()+": потрібно "+total+" грн, є "+customer.getWalletBalance()+" грн");
        return false;
    }
}

class PhysicsEngine{
    public static final double G=9.80665;
    public static final double SPEED_OF_LIGHT=299792458.0;

    private PhysicsEngine(){}

    public static double freeFallDistance(double seconds){
        return G*seconds*seconds/2;
    }

    public static double kineticEnergy(double massKg,double velocityMs){
        return massKg*velocityMs*velocityMs/2;
    }

    public static double restEnergy(double massKg){
        return massKg*SPEED_OF_LIGHT*SPEED_OF_LIGHT;
    }
}

class Point{
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}

class Point2D{
    private double x;
    private double y;

    public Point2D(){
        this.x=0.0;
        this.y=0.0;
    }

    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double distanceToOrigin(){
        return Math.sqrt(x*x+y*y);
    }

    public double distanceTo(double targetX,double targetY){
        double dx=targetX-x;
        double dy=targetY-y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public void printPoint(){
        System.out.println("Point("+x+"; "+y+")");
    }
}

class Processor{
    private String model;
    private double frequencyGHz;
    private double price;

    public Processor(String model,double frequencyGHz,double price){
        this.model=model;
        this.frequencyGHz=frequencyGHz;
        this.price=price;
    }

    public String getModel(){
        return model;
    }

    public double getFrequencyGHz(){
        return frequencyGHz;
    }

    public double getPrice(){
        return price;
    }
}

class Product{
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name,double price,int quantity,String category){
        this.name=name;
        this.category=category;
        if(price<0){
            this.price=0.0;
        }else{
            this.price=price;
        }
        if(quantity<0){
            this.quantity=0;
        }else{
            this.quantity=quantity;
        }
    }

    public double getTotalValue(){
        return price*quantity;
    }

    public void applyDiscount(double percent){
        if(percent<0||percent>100){
            System.out.println("Некоректний відсоток знижки: "+percent);
            return;
        }
        this.price-=this.price*percent/100;
    }

    public void printProduct(){
        System.out.println("Товар: "+name+" | Категорія: "+category+" | Ціна: "+price+" | Кількість: "+quantity+" | Вартість партії: "+getTotalValue());
    }
}

class QueryBuilder{
    private String table;
    private String fields="*";
    private String whereClause="";

    public QueryBuilder(String table){
        this.table=table;
    }

    public QueryBuilder select(String fields){
        this.fields=fields;
        return this;
    }

    public QueryBuilder where(String condition){
        this.whereClause=condition;
        return this;
    }

    public String build(){
        return "SELECT "+fields+" FROM "+table+(whereClause.isEmpty()?"":" WHERE "+whereClause)+";";
    }
}

class Rectangle{
    private double width;
    private double height;

    public Rectangle(){
        this(1.0,1.0);
    }

    public Rectangle(double size){
        this(size,size);
    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }

    public boolean isSquare(){
        return width==height;
    }
}

class SalaryCalculator{
    public double calculate(double baseRate){
        return baseRate;
    }

    public double calculate(double baseRate,double fixedBonus){
        return baseRate+fixedBonus;
    }

    public double calculate(double baseRate,double bonusPercent,boolean isTaxDeducted){
        double result=baseRate+baseRate*bonusPercent/100;
        if(isTaxDeducted){
            result-=result*0.195;
        }
        return result;
    }

    public double calculate(double baseRate,int overtimeHours,double overtimeHourlyRate){
        return baseRate+overtimeHours*overtimeHourlyRate;
    }
}

class ServerConfig{
    public static final String SERVER_NAME="AlphaEnterprise";
    public static final int MAX_CONNECTIONS=5;

    private static int activeConnections=0;

    public static boolean connect(){
        if(activeConnections<MAX_CONNECTIONS){
            activeConnections++;
            return true;
        }
        return false;
    }

    public static void disconnect(){
        if(activeConnections>0){
            activeConnections--;
        }
    }

    public static void printServerStatus(){
        System.out.println("Сервер "+SERVER_NAME+": підключень "+activeConnections+", вільних слотів "+(MAX_CONNECTIONS-activeConnections));
    }
}

class ShopProduct{
    private int id;
    private String title;
    private double price;

    public ShopProduct(int id,String title,double price){
        this.id=id;
        this.title=title;
        this.price=price;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }
}

class SmartBulb{
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness,int colorTemp,boolean isOn){
        if(brightness<0){
            brightness=0;
        }
        if(brightness>100){
            brightness=100;
        }
        if(colorTemp<2700){
            colorTemp=2700;
        }
        if(colorTemp>6500){
            colorTemp=6500;
        }
        this.brightness=brightness;
        this.colorTemp=colorTemp;
        this.isOn=isOn;
    }

    public SmartBulb(int brightness){
        this(brightness,4000,true);
    }

    public SmartBulb(){
        this(50);
    }

    public void printStatus(){
        System.out.println("Лампочка: яскравість "+brightness+"%, температура "+colorTemp+"K, увімкнена: "+isOn);
    }
}

class StringUtils{
    private StringUtils(){}

    public static boolean isPalindrome(String s){
        String text=s.toLowerCase().replace(" ","");
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static String reverse(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }

    public static int countVowels(String s){
        String vowels="aeiouаеєиіїоуюя";
        String text=s.toLowerCase();
        int count=0;
        for(int i=0;i<text.length();i++){
            if(vowels.indexOf(text.charAt(i))>=0){
                count++;
            }
        }
        return count;
    }

    public static String maskCardNumber(String cardNumber){
        String digits=cardNumber.replace(" ","");
        String result="";
        for(int i=0;i<digits.length();i++){
            if(i>0&&i%4==0){
                result+=" ";
            }
            if(i<digits.length()-4){
                result+="*";
            }else{
                result+=digits.charAt(i);
            }
        }
        return result;
    }
}

class Student{
    private String name;
    private int age;
    private double gpa;

    public Student(String name,int age,double gpa){
        this.name=name;
        if(age<15||age>80){
            this.age=18;
        }else{
            this.age=age;
        }
        if(gpa<0.0||gpa>5.0){
            this.gpa=0.0;
        }else{
            this.gpa=gpa;
        }
    }

    public boolean isHonorStudent(){
        return gpa>=4.5;
    }

    public void printStudent(){
        String status=isHonorStudent()?"Відмінник":"Звичайний студент";
        System.out.println("Студент: "+name+", вік: "+age+", середній бал: "+gpa+" ("+status+")");
    }
}

class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours,int minutes,int seconds){
        if(hours<0||hours>23){
            this.hours=0;
        }else{
            this.hours=hours;
        }
        if(minutes<0||minutes>59){
            this.minutes=0;
        }else{
            this.minutes=minutes;
        }
        if(seconds<0||seconds>59){
            this.seconds=0;
        }else{
            this.seconds=seconds;
        }
    }

    public void tick(){
        seconds++;
        if(seconds==60){
            seconds=0;
            minutes++;
            if(minutes==60){
                minutes=0;
                hours++;
                if(hours==24){
                    hours=0;
                }
            }
        }
    }

    private String twoDigits(int value){
        if(value<10){
            return "0"+value;
        }
        return ""+value;
    }

    public String toUniversalString(){
        return twoDigits(hours)+":"+twoDigits(minutes)+":"+twoDigits(seconds);
    }

    public String toStandardString(){
        int h=hours%12;
        String period=hours<12?"AM":"PM";
        if(h==0){
            h=12;
        }
        return h+":"+twoDigits(minutes)+":"+twoDigits(seconds)+" "+period;
    }
}

class User{
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login,String email,String role,boolean isActive){
        this.login=login;
        this.email=email;
        this.role=role;
        this.isActive=isActive;
    }

    public User(String login,String email){
        this(login,email,"USER",true);
    }

    public User(String login){
        this(login,login+"@domain.com");
    }

    public User(){
        this("guest");
    }

    public void printProfile(){
        System.out.println("Користувач: "+login+" | email: "+email+" | роль: "+role+" | активний: "+isActive);
    }
}

class UserAccount{
    private static int nextId=1001;

    private int id;
    private String username;
    private String email;

    public UserAccount(String username,String email){
        this.id=nextId++;
        this.username=username;
        this.email=email;
    }

    public static int getNextAvailableId(){
        return nextId;
    }

    public static void resetIdSequence(int startId){
        nextId=startId;
    }

    public void printAccount(){
        System.out.println("ID: "+id+" | "+username+" | "+email);
    }
}

class Vector3D{
    private double x;
    private double y;
    private double z;

    public Vector3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector3D(){
        this(0,0,0);
    }

    public Vector3D add(Vector3D other){
        return new Vector3D(this.x+other.x,this.y+other.y,this.z+other.z);
    }

    public double dotProduct(Vector3D other){
        return this.x*other.x+this.y*other.y+this.z*other.z;
    }

    public Vector3D crossProduct(Vector3D other){
        return new Vector3D(this.y*other.z-this.z*other.y,this.z*other.x-this.x*other.z,this.x*other.y-this.y*other.x);
    }

    public boolean isOrthogonalTo(Vector3D other){
        return dotProduct(other)==0;
    }

    public boolean isEqualTo(Vector3D other){
        return this.x==other.x&&this.y==other.y&&this.z==other.z;
    }

    @Override
    public String toString(){
        return "Vector3D("+x+"; "+y+"; "+z+")";
    }
}
