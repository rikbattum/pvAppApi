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
import javax.persistence.Lob;
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
@Table(name = "rit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rit.findAll", query = "SELECT r FROM Rit r"),
    @NamedQuery(name = "Rit.findByRitid", query = "SELECT r FROM Rit r WHERE r.ritid = :ritid"),
    @NamedQuery(name = "Rit.findByComments", query = "SELECT r FROM Rit r WHERE r.comments = :comments"),
    @NamedQuery(name = "Rit.findByCreatedon", query = "SELECT r FROM Rit r WHERE r.createdon = :createdon"),
    @NamedQuery(name = "Rit.findByImage1", query = "SELECT r FROM Rit r WHERE r.image1 = :image1"),
    @NamedQuery(name = "Rit.findByImage2", query = "SELECT r FROM Rit r WHERE r.image2 = :image2"),
    @NamedQuery(name = "Rit.findByImage3", query = "SELECT r FROM Rit r WHERE r.image3 = :image3"),
    @NamedQuery(name = "Rit.findByRitdate", query = "SELECT r FROM Rit r WHERE r.ritdate = :ritdate"),
    @NamedQuery(name = "Rit.findByRitimage", query = "SELECT r FROM Rit r WHERE r.ritimage = :ritimage"),
    @NamedQuery(name = "Rit.findByRitname", query = "SELECT r FROM Rit r WHERE r.ritname = :ritname"),
    @NamedQuery(name = "Rit.findByRitplace", query = "SELECT r FROM Rit r WHERE r.ritplace = :ritplace"),
    @NamedQuery(name = "Rit.findByTyprit", query = "SELECT r FROM Rit r WHERE r.typrit = :typrit")})
public class Rit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ritid")
    private Long ritid;
    @Size(max = 255)
    @Column(name = "comments")
    private String comments;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "image1")
    private String image1;
    @Size(max = 255)
    @Column(name = "image2")
    private String image2;
    @Size(max = 255)
    @Column(name = "image3")
    private String image3;
    @Column(name = "ritdate")
    @Temporal(TemporalType.DATE)
    private Date ritdate;
    @Size(max = 255)
    @Column(name = "ritimage")
    private String ritimage;
    @Lob
    @Column(name = "ritmap")
    private byte[] ritmap;
    @Size(max = 255)
    @Column(name = "ritname")
    private String ritname;
    @Size(max = 255)
    @Column(name = "ritplace")
    private String ritplace;
    @Size(max = 255)
    @Column(name = "typrit")
    private String typrit;
    @JoinColumn(name = "horseid", referencedColumnName = "horseid")
    @ManyToOne
    private Horse horseid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;

    public Rit() {
    }

    public Rit(Long ritid) {
        this.ritid = ritid;
    }

    public Long getRitid() {
        return ritid;
    }

    public void setRitid(Long ritid) {
        this.ritid = ritid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public Date getRitdate() {
        return ritdate;
    }

    public void setRitdate(Date ritdate) {
        this.ritdate = ritdate;
    }

    public String getRitimage() {
        return ritimage;
    }

    public void setRitimage(String ritimage) {
        this.ritimage = ritimage;
    }

    public byte[] getRitmap() {
        return ritmap;
    }

    public void setRitmap(byte[] ritmap) {
        this.ritmap = ritmap;
    }

    public String getRitname() {
        return ritname;
    }

    public void setRitname(String ritname) {
        this.ritname = ritname;
    }

    public String getRitplace() {
        return ritplace;
    }

    public void setRitplace(String ritplace) {
        this.ritplace = ritplace;
    }

    public String getTyprit() {
        return typrit;
    }

    public void setTyprit(String typrit) {
        this.typrit = typrit;
    }

    public Horse getHorseid() {
        return horseid;
    }

    public void setHorseid(Horse horseid) {
        this.horseid = horseid;
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
        hash += (ritid != null ? ritid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rit)) {
            return false;
        }
        Rit other = (Rit) object;
        if ((this.ritid == null && other.ritid != null) || (this.ritid != null && !this.ritid.equals(other.ritid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rit[ ritid=" + ritid + " ]";
    }
    
}
