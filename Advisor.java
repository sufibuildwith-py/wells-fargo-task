@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String firstName, String lastName,
                            String email, String phone,
                            List<Client> clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    // Getters & Setters
}