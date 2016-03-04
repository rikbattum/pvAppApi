/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gebruiker
 */
@Entity
@Table(name = "ritlike")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ritlike.findAll", query = "SELECT r FROM Ritlike r"),
    @NamedQuery(name = "Ritlike.findByRitlikeid", query = "SELECT r FROM Ritlike r WHERE r.ritlikeid = :ritlikeid"),
    @NamedQuery(name = "Ritlike.findByCreatedon", query = "SELECT r FROM Ritlike r WHERE r.createdon = :createdon"),
    @NamedQuery(name = "Ritlike.findByLiketype", query = "SELECT r FROM Ritlike r WHERE r.liketype = :liketype")})
public class Ritlike implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ritlikeid")
    private Long ritlikeid;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "liketype")
    private String liketype;
    @JoinColumn(name = "ritid", referencedColumnName = "eventid")
    @ManyToOne
    private Event ritid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;

    public Ritlike() {
    }

    public Ritlike(Long ritlikeid) {
        this.ritlikeid = ritlikeid;
    }

    public Long getRitlikeid() {
        return ritlikeid;
    }

    public void setRitlikeid(Long ritlikeid) {
        this.ritlikeid = ritlikeid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLiketype() {
        return liketype;
    }

    public void setLiketype(String liketype) {
        this.liketype = liketype;
    }

    public Event getRitid() {
        return ritid;
    }

    public void setRitid(Event ritid) {
        this.ritid = ritid;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ritlikeid != null ? ritlikeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ritlike)) {
            return false;
        }
        Ritlike other = (Ritlike) object;
        if ((this.ritlikeid == null && other.ritlikeid != null) || (this.ritlikeid != null && !this.ritlikeid.equals(other.ritlikeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ritlike[ ritlikeid=" + ritlikeid + " ]";
    }
    
}
