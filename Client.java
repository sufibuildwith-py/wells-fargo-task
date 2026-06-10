@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}

    public Client(String firstName, String lastName,
                  String email, String phone,
                  FinancialAdvisor advisor,
                  Portfolio portfolio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    // Getters & Setters
}
