package ifc.ibirama.entidades;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Bombeiro")
public class Bombeiro {

    @Id
    @GeneratedValue(strategy = GenerateType.IDENTITY)
    @Column(name = "bom_id",)
    private Integer id;
    @Column(name = "bom_cpf", lenght = 11, unique = true, nullable = false)
    private String cpf;
    @Column(name = "bom_data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "bom_nome_completo", lenght = 45, nullable = false)
    private String nome;
    @Column(name = "bom_nome_guerra", lenght = 45, unique = true, nullable = false)
    private String guerra;

    //construtor
    public Bombeiro() {
    }

    // get/set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGuerra() {
        return guerra;
    }

    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
