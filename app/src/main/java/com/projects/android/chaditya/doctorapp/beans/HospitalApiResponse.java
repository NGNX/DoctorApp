package com.projects.android.chaditya.doctorapp.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ch.aditya on 01-07-2016.
 */
public class HospitalApiResponse {

    private String help;
    private Boolean success;
    private Integer count;
    private Fields fields;
    private List<Record> records = new ArrayList<Record>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The help
     */
    public String getHelp() {
        return help;
    }

    /**
     *
     * @param help
     * The help
     */
    public void setHelp(String help) {
        this.help = help;
    }

    /**
     *
     * @return
     * The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The fields
     */
    public Fields getFields() {
        return fields;
    }

    /**
     *
     * @param fields
     * The fields
     */
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    /**
     *
     * @return
     * The records
     */
    public List<Record> getRecords() {
        return records;
    }

    /**
     *
     * @param records
     * The records
     */
    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class AddressFirstLine {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Ambulancephoneno {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class District {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Emergencynum {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Facilities {

    private String type;
    private String size;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Fields {

    private Id id;
    private Timestamp timestamp;
    private SrNo srNo;
    private Hospitalname hospitalname;
    private HospitalCategory hospitalCategory;
    private Hostipalcaretype hostipalcaretype;
    private SystemsOfMedicine systemsOfMedicine;
    private AddressFirstLine addressFirstLine;
    private State state;
    private District district;
    private Subdristrict subdristrict;
    private Pincode pincode;
    private Telephone telephone;
    private Mobilenumber mobilenumber;
    private Emergencynum emergencynum;
    private Ambulancephoneno ambulancephoneno;
    private Tollfree tollfree;
    private Helpline helpline;
    private Hospitalfax hospitalfax;
    private Hospitalprimaryemailid hospitalprimaryemailid;
    private Hospitalsecondaryemailid hospitalsecondaryemailid;
    private Website website;
    private Specialties specialties;
    private GooglemapcorridinateLati googlemapcorridinateLati;
    private GooglemapcorridinateLongi googlemapcorridinateLongi;
    private Facilities facilities;
    private Totalnumofbeds totalnumofbeds;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    public Id getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     * The timestamp
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     * The srNo
     */
    public SrNo getSrNo() {
        return srNo;
    }

    /**
     *
     * @param srNo
     * The Sr. No.
     */
    public void setSrNo(SrNo srNo) {
        this.srNo = srNo;
    }

    /**
     *
     * @return
     * The hospitalname
     */
    public Hospitalname getHospitalname() {
        return hospitalname;
    }

    /**
     *
     * @param hospitalname
     * The hospitalname
     */
    public void setHospitalname(Hospitalname hospitalname) {
        this.hospitalname = hospitalname;
    }

    /**
     *
     * @return
     * The hospitalCategory
     */
    public HospitalCategory getHospitalCategory() {
        return hospitalCategory;
    }

    /**
     *
     * @param hospitalCategory
     * The Hospital Category
     */
    public void setHospitalCategory(HospitalCategory hospitalCategory) {
        this.hospitalCategory = hospitalCategory;
    }

    /**
     *
     * @return
     * The hostipalcaretype
     */
    public Hostipalcaretype getHostipalcaretype() {
        return hostipalcaretype;
    }

    /**
     *
     * @param hostipalcaretype
     * The hostipalcaretype
     */
    public void setHostipalcaretype(Hostipalcaretype hostipalcaretype) {
        this.hostipalcaretype = hostipalcaretype;
    }

    /**
     *
     * @return
     * The systemsOfMedicine
     */
    public SystemsOfMedicine getSystemsOfMedicine() {
        return systemsOfMedicine;
    }

    /**
     *
     * @param systemsOfMedicine
     * The Systems of Medicine
     */
    public void setSystemsOfMedicine(SystemsOfMedicine systemsOfMedicine) {
        this.systemsOfMedicine = systemsOfMedicine;
    }

    /**
     *
     * @return
     * The addressFirstLine
     */
    public AddressFirstLine getAddressFirstLine() {
        return addressFirstLine;
    }

    /**
     *
     * @param addressFirstLine
     * The address First Line
     */
    public void setAddressFirstLine(AddressFirstLine addressFirstLine) {
        this.addressFirstLine = addressFirstLine;
    }

    /**
     *
     * @return
     * The state
     */
    public State getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The district
     */
    public District getDistrict() {
        return district;
    }

    /**
     *
     * @param district
     * The district
     */
    public void setDistrict(District district) {
        this.district = district;
    }

    /**
     *
     * @return
     * The subdristrict
     */
    public Subdristrict getSubdristrict() {
        return subdristrict;
    }

    /**
     *
     * @param subdristrict
     * The subdristrict
     */
    public void setSubdristrict(Subdristrict subdristrict) {
        this.subdristrict = subdristrict;
    }

    /**
     *
     * @return
     * The pincode
     */
    public Pincode getPincode() {
        return pincode;
    }

    /**
     *
     * @param pincode
     * The pincode
     */
    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    /**
     *
     * @return
     * The telephone
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     * The telephone
     */
    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * @return
     * The mobilenumber
     */
    public Mobilenumber getMobilenumber() {
        return mobilenumber;
    }

    /**
     *
     * @param mobilenumber
     * The mobilenumber
     */
    public void setMobilenumber(Mobilenumber mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
     *
     * @return
     * The emergencynum
     */
    public Emergencynum getEmergencynum() {
        return emergencynum;
    }

    /**
     *
     * @param emergencynum
     * The emergencynum
     */
    public void setEmergencynum(Emergencynum emergencynum) {
        this.emergencynum = emergencynum;
    }

    /**
     *
     * @return
     * The ambulancephoneno
     */
    public Ambulancephoneno getAmbulancephoneno() {
        return ambulancephoneno;
    }

    /**
     *
     * @param ambulancephoneno
     * The ambulancephoneno
     */
    public void setAmbulancephoneno(Ambulancephoneno ambulancephoneno) {
        this.ambulancephoneno = ambulancephoneno;
    }

    /**
     *
     * @return
     * The tollfree
     */
    public Tollfree getTollfree() {
        return tollfree;
    }

    /**
     *
     * @param tollfree
     * The tollfree
     */
    public void setTollfree(Tollfree tollfree) {
        this.tollfree = tollfree;
    }

    /**
     *
     * @return
     * The helpline
     */
    public Helpline getHelpline() {
        return helpline;
    }

    /**
     *
     * @param helpline
     * The helpline
     */
    public void setHelpline(Helpline helpline) {
        this.helpline = helpline;
    }

    /**
     *
     * @return
     * The hospitalfax
     */
    public Hospitalfax getHospitalfax() {
        return hospitalfax;
    }

    /**
     *
     * @param hospitalfax
     * The hospitalfax
     */
    public void setHospitalfax(Hospitalfax hospitalfax) {
        this.hospitalfax = hospitalfax;
    }

    /**
     *
     * @return
     * The hospitalprimaryemailid
     */
    public Hospitalprimaryemailid getHospitalprimaryemailid() {
        return hospitalprimaryemailid;
    }

    /**
     *
     * @param hospitalprimaryemailid
     * The hospitalprimaryemailid
     */
    public void setHospitalprimaryemailid(Hospitalprimaryemailid hospitalprimaryemailid) {
        this.hospitalprimaryemailid = hospitalprimaryemailid;
    }

    /**
     *
     * @return
     * The hospitalsecondaryemailid
     */
    public Hospitalsecondaryemailid getHospitalsecondaryemailid() {
        return hospitalsecondaryemailid;
    }

    /**
     *
     * @param hospitalsecondaryemailid
     * The hospitalsecondaryemailid
     */
    public void setHospitalsecondaryemailid(Hospitalsecondaryemailid hospitalsecondaryemailid) {
        this.hospitalsecondaryemailid = hospitalsecondaryemailid;
    }

    /**
     *
     * @return
     * The website
     */
    public Website getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     * The website
     */
    public void setWebsite(Website website) {
        this.website = website;
    }

    /**
     *
     * @return
     * The specialties
     */
    public Specialties getSpecialties() {
        return specialties;
    }

    /**
     *
     * @param specialties
     * The specialties
     */
    public void setSpecialties(Specialties specialties) {
        this.specialties = specialties;
    }

    /**
     *
     * @return
     * The googlemapcorridinateLati
     */
    public GooglemapcorridinateLati getGooglemapcorridinateLati() {
        return googlemapcorridinateLati;
    }

    /**
     *
     * @param googlemapcorridinateLati
     * The googlemapcorridinate_lati
     */
    public void setGooglemapcorridinateLati(GooglemapcorridinateLati googlemapcorridinateLati) {
        this.googlemapcorridinateLati = googlemapcorridinateLati;
    }

    /**
     *
     * @return
     * The googlemapcorridinateLongi
     */
    public GooglemapcorridinateLongi getGooglemapcorridinateLongi() {
        return googlemapcorridinateLongi;
    }

    /**
     *
     * @param googlemapcorridinateLongi
     * The googlemapcorridinate_longi
     */
    public void setGooglemapcorridinateLongi(GooglemapcorridinateLongi googlemapcorridinateLongi) {
        this.googlemapcorridinateLongi = googlemapcorridinateLongi;
    }

    /**
     *
     * @return
     * The facilities
     */
    public Facilities getFacilities() {
        return facilities;
    }

    /**
     *
     * @param facilities
     * The facilities
     */
    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    /**
     *
     * @return
     * The totalnumofbeds
     */
    public Totalnumofbeds getTotalnumofbeds() {
        return totalnumofbeds;
    }

    /**
     *
     * @param totalnumofbeds
     * The totalnumofbeds
     */
    public void setTotalnumofbeds(Totalnumofbeds totalnumofbeds) {
        this.totalnumofbeds = totalnumofbeds;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class GooglemapcorridinateLati {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class GooglemapcorridinateLongi {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Helpline {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class HospitalCategory {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Hospitalfax {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Hospitalname {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Hospitalprimaryemailid {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Hospitalsecondaryemailid {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Hostipalcaretype {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Id {

    private String type;
    private String size;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Mobilenumber {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Pincode {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Specialties {

    private String type;
    private String size;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class SrNo {

    private String type;
    private String size;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class State {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Subdristrict {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class SystemsOfMedicine {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Telephone {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Timestamp {

    private String type;
    private String size;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Tollfree {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Totalnumofbeds {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

class Website {

    private String type;
    private String size;
    private String length;
    private Boolean notNull;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The length
     */
    public String getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     *
     * @return
     * The notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    /**
     *
     * @param notNull
     * The not null
     */
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}