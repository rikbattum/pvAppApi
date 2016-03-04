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
@Table(name = "message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
    @NamedQuery(name = "Message.findByMessageid", query = "SELECT m FROM Message m WHERE m.messageid = :messageid"),
    @NamedQuery(name = "Message.findByCreatedon", query = "SELECT m FROM Message m WHERE m.createdon = :createdon"),
    @NamedQuery(name = "Message.findByMessagetype", query = "SELECT m FROM Message m WHERE m.messagetype = :messagetype")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "messageid")
    private Long messageid;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "messagetype")
    private String messagetype;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;
    @OneToMany(mappedBy = "messageid")
    private Collection<Messagecomment> messagecommentCollection;
    @OneToMany(mappedBy = "messageid")
    private Collection<Messagelike> messagelikeCollection;

    public Message() {
    }

    public Message(Long messageid) {
        this.messageid = messageid;
    }

    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @XmlTransient
    public Collection<Messagecomment> getMessagecommentCollection() {
        return messagecommentCollection;
    }

    public void setMessagecommentCollection(Collection<Messagecomment> messagecommentCollection) {
        this.messagecommentCollection = messagecommentCollection;
    }

    @XmlTransient
    public Collection<Messagelike> getMessagelikeCollection() {
        return messagelikeCollection;
    }

    public void setMessagelikeCollection(Collection<Messagelike> messagelikeCollection) {
        this.messagelikeCollection = messagelikeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageid != null ? messageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.messageid == null && other.messageid != null) || (this.messageid != null && !this.messageid.equals(other.messageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Message[ messageid=" + messageid + " ]";
    }
    
}
