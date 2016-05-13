/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gebruiker
 */
@Entity
@Table(name = "horse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horse.findAll", query = "SELECT h FROM Horse h"),
    @NamedQuery(name = "Horse.findByHorseid", query = "SELECT h FROM Horse h WHERE h.horseid = :horseid"),
    @NamedQuery(name = "Horse.findByAfstamming", query = "SELECT h FROM Horse h WHERE h.afstamming = :afstamming"),
    @NamedQuery(name = "Horse.findByCreatedon", query = "SELECT h FROM Horse h WHERE h.createdon = :createdon"),
    @NamedQuery(name = "Horse.findByDrafsport", query = "SELECT h FROM Horse h WHERE h.drafsport = :drafsport"),
    @NamedQuery(name = "Horse.findByDressuur", query = "SELECT h FROM Horse h WHERE h.dressuur = :dressuur"),
    @NamedQuery(name = "Horse.findByEndurance", query = "SELECT h FROM Horse h WHERE h.endurance = :endurance"),
    @NamedQuery(name = "Horse.findByEventing", query = "SELECT h FROM Horse h WHERE h.eventing = :eventing"),
    @NamedQuery(name = "Horse.findByFokken", query = "SELECT h FROM Horse h WHERE h.fokken = :fokken"),
    @NamedQuery(name = "Horse.findByGeboortedatum", query = "SELECT h FROM Horse h WHERE h.geboortedatum = :geboortedatum"),
    @NamedQuery(name = "Horse.findByGeslacht", query = "SELECT h FROM Horse h WHERE h.geslacht = :geslacht"),
    @NamedQuery(name = "Horse.findByHorseimage", query = "SELECT h FROM Horse h WHERE h.horseimage = :horseimage"),
    @NamedQuery(name = "Horse.findByKarakter", query = "SELECT h FROM Horse h WHERE h.karakter = :karakter"),
    @NamedQuery(name = "Horse.findByMennen", query = "SELECT h FROM Horse h WHERE h.mennen = :mennen"),
    @NamedQuery(name = "Horse.findByNaturalhorsemanship", query = "SELECT h FROM Horse h WHERE h.naturalhorsemanship = :naturalhorsemanship"),
    @NamedQuery(name = "Horse.findByOvermijnpaard", query = "SELECT h FROM Horse h WHERE h.overmijnpaard = :overmijnpaard"),
    @NamedQuery(name = "Horse.findByPolo", query = "SELECT h FROM Horse h WHERE h.polo = :polo"),
    @NamedQuery(name = "Horse.findByRensport", query = "SELECT h FROM Horse h WHERE h.rensport = :rensport"),
    @NamedQuery(name = "Horse.findByRingsteken", query = "SELECT h FROM Horse h WHERE h.ringsteken = :ringsteken"),
    @NamedQuery(name = "Horse.findByRodeo", query = "SELECT h FROM Horse h WHERE h.rodeo = :rodeo"),
    @NamedQuery(name = "Horse.findByShowrijden", query = "SELECT h FROM Horse h WHERE h.showrijden = :showrijden"),
    @NamedQuery(name = "Horse.findBySportklassedressuur", query = "SELECT h FROM Horse h WHERE h.sportklassedressuur = :sportklassedressuur"),
    @NamedQuery(name = "Horse.findBySportklasseeventing", query = "SELECT h FROM Horse h WHERE h.sportklasseeventing = :sportklasseeventing"),
    @NamedQuery(name = "Horse.findBySportklassemennen", query = "SELECT h FROM Horse h WHERE h.sportklassemennen = :sportklassemennen"),
    @NamedQuery(name = "Horse.findBySportklassespringen", query = "SELECT h FROM Horse h WHERE h.sportklassespringen = :sportklassespringen"),
    @NamedQuery(name = "Horse.findBySportklassevoltige", query = "SELECT h FROM Horse h WHERE h.sportklassevoltige = :sportklassevoltige"),
    @NamedQuery(name = "Horse.findBySpringen", query = "SELECT h FROM Horse h WHERE h.springen = :springen"),
    @NamedQuery(name = "Horse.findByTranfer", query = "SELECT h FROM Horse h WHERE h.tranfer = :tranfer"),
    @NamedQuery(name = "Horse.findByVoltige", query = "SELECT h FROM Horse h WHERE h.voltige = :voltige"),
    @NamedQuery(name = "Horse.findByVoornaam", query = "SELECT h FROM Horse h WHERE h.voornaam = :voornaam"),
    @NamedQuery(name = "Horse.findByVossenjacht", query = "SELECT h FROM Horse h WHERE h.vossenjacht = :vossenjacht"),
    @NamedQuery(name = "Horse.findByWaarde", query = "SELECT h FROM Horse h WHERE h.waarde = :waarde"),
    @NamedQuery(name = "Horse.findByWestern", query = "SELECT h FROM Horse h WHERE h.western = :western")})
public class Horse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "horseid")
    private Long horseid;
    @Size(max = 255)
    @Column(name = "afstamming")
    private String afstamming;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Column(name = "drafsport")
    private Boolean drafsport;
    @Column(name = "dressuur")
    private Boolean dressuur;
    @Column(name = "endurance")
    private Boolean endurance;
    @Column(name = "eventing")
    private Boolean eventing;
    @Column(name = "fokken")
    private Boolean fokken;
    @Column(name = "geboortedatum")
    @Temporal(TemporalType.DATE)
    private Date geboortedatum;
    @Size(max = 255)
    @Column(name = "geslacht")
    private String geslacht;
    @Size(max = 255)
    @Column(name = "horseimage")
    private String horseimage;
    @Size(max = 255)
    @Column(name = "karakter")
    private String karakter;
    @Column(name = "mennen")
    private Boolean mennen;
    @Column(name = "naturalhorsemanship")
    private Boolean naturalhorsemanship;
    @Size(max = 255)
    @Column(name = "overmijnpaard")
    private String overmijnpaard;
    @Column(name = "polo")
    private Boolean polo;
    @Column(name = "rensport")
    private Boolean rensport;
    @Column(name = "ringsteken")
    private Boolean ringsteken;
    @Column(name = "rodeo")
    private Boolean rodeo;
    @Column(name = "showrijden")
    private Boolean showrijden;
    @Size(max = 255)
    @Column(name = "sportklassedressuur")
    private String sportklassedressuur;
    @Size(max = 255)
    @Column(name = "sportklasseeventing")
    private String sportklasseeventing;
    @Size(max = 255)
    @Column(name = "sportklassemennen")
    private String sportklassemennen;
    @Size(max = 255)
    @Column(name = "sportklassespringen")
    private String sportklassespringen;
    @Size(max = 255)
    @Column(name = "sportklassevoltige")
    private String sportklassevoltige;
    @Column(name = "springen")
    private Boolean springen;
    @Size(max = 255)
    @Column(name = "tranfer")
    private String tranfer;
    @Column(name = "voltige")
    private Boolean voltige;
    @Size(max = 255)
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "vossenjacht")
    private Boolean vossenjacht;
    @Size(max = 255)
    @Column(name = "waarde")
    private String waarde;
    @Column(name = "western")
    private Boolean western;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;
    @OneToMany(mappedBy = "horseid")
    private Collection<Event> eventCollection;
    @OneToMany(mappedBy = "horseid")
    private Collection<Rit> ritCollection;

    public Horse() {
    }

    public Horse(Long horseid) {
        this.horseid = horseid;
    }

    public Long getHorseid() {
        return horseid;
    }

    public void setHorseid(Long horseid) {
        this.horseid = horseid;
    }

    public String getAfstamming() {
        return afstamming;
    }

    public void setAfstamming(String afstamming) {
        this.afstamming = afstamming;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Boolean getDrafsport() {
        return drafsport;
    }

    public void setDrafsport(Boolean drafsport) {
        this.drafsport = drafsport;
    }

    public Boolean getDressuur() {
        return dressuur;
    }

    public void setDressuur(Boolean dressuur) {
        this.dressuur = dressuur;
    }

    public Boolean getEndurance() {
        return endurance;
    }

    public void setEndurance(Boolean endurance) {
        this.endurance = endurance;
    }

    public Boolean getEventing() {
        return eventing;
    }

    public void setEventing(Boolean eventing) {
        this.eventing = eventing;
    }

    public Boolean getFokken() {
        return fokken;
    }

    public void setFokken(Boolean fokken) {
        this.fokken = fokken;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getHorseimage() {
        return horseimage;
    }

    public void setHorseimage(String horseimage) {
        this.horseimage = horseimage;
    }

    public String getKarakter() {
        return karakter;
    }

    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

    public Boolean getMennen() {
        return mennen;
    }

    public void setMennen(Boolean mennen) {
        this.mennen = mennen;
    }

    public Boolean getNaturalhorsemanship() {
        return naturalhorsemanship;
    }

    public void setNaturalhorsemanship(Boolean naturalhorsemanship) {
        this.naturalhorsemanship = naturalhorsemanship;
    }

    public String getOvermijnpaard() {
        return overmijnpaard;
    }

    public void setOvermijnpaard(String overmijnpaard) {
        this.overmijnpaard = overmijnpaard;
    }

    public Boolean getPolo() {
        return polo;
    }

    public void setPolo(Boolean polo) {
        this.polo = polo;
    }

    public Boolean getRensport() {
        return rensport;
    }

    public void setRensport(Boolean rensport) {
        this.rensport = rensport;
    }

    public Boolean getRingsteken() {
        return ringsteken;
    }

    public void setRingsteken(Boolean ringsteken) {
        this.ringsteken = ringsteken;
    }

    public Boolean getRodeo() {
        return rodeo;
    }

    public void setRodeo(Boolean rodeo) {
        this.rodeo = rodeo;
    }

    public Boolean getShowrijden() {
        return showrijden;
    }

    public void setShowrijden(Boolean showrijden) {
        this.showrijden = showrijden;
    }

    public String getSportklassedressuur() {
        return sportklassedressuur;
    }

    public void setSportklassedressuur(String sportklassedressuur) {
        this.sportklassedressuur = sportklassedressuur;
    }

    public String getSportklasseeventing() {
        return sportklasseeventing;
    }

    public void setSportklasseeventing(String sportklasseeventing) {
        this.sportklasseeventing = sportklasseeventing;
    }

    public String getSportklassemennen() {
        return sportklassemennen;
    }

    public void setSportklassemennen(String sportklassemennen) {
        this.sportklassemennen = sportklassemennen;
    }

    public String getSportklassespringen() {
        return sportklassespringen;
    }

    public void setSportklassespringen(String sportklassespringen) {
        this.sportklassespringen = sportklassespringen;
    }

    public String getSportklassevoltige() {
        return sportklassevoltige;
    }

    public void setSportklassevoltige(String sportklassevoltige) {
        this.sportklassevoltige = sportklassevoltige;
    }

    public Boolean getSpringen() {
        return springen;
    }

    public void setSpringen(Boolean springen) {
        this.springen = springen;
    }

    public String getTranfer() {
        return tranfer;
    }

    public void setTranfer(String tranfer) {
        this.tranfer = tranfer;
    }

    public Boolean getVoltige() {
        return voltige;
    }

    public void setVoltige(Boolean voltige) {
        this.voltige = voltige;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Boolean getVossenjacht() {
        return vossenjacht;
    }

    public void setVossenjacht(Boolean vossenjacht) {
        this.vossenjacht = vossenjacht;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

    public Boolean getWestern() {
        return western;
    }

    public void setWestern(Boolean western) {
        this.western = western;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @XmlTransient
    public Collection<Event> getEventCollection() {
        return eventCollection;
    }

    public void setEventCollection(Collection<Event> eventCollection) {
        this.eventCollection = eventCollection;
    }

    @XmlTransient
    public Collection<Rit> getRitCollection() {
        return ritCollection;
    }

    public void setRitCollection(Collection<Rit> ritCollection) {
        this.ritCollection = ritCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horseid != null ? horseid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horse)) {
            return false;
        }
        Horse other = (Horse) object;
        if ((this.horseid == null && other.horseid != null) || (this.horseid != null && !this.horseid.equals(other.horseid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Horse[ horseid=" + horseid + " ]";
    }
    
}
