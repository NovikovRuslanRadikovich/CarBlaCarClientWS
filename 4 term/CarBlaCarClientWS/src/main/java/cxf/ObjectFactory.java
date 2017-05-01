
package cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindBySearchResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "findBySearchResponse");
    private final static QName _FindById_QNAME = new QName("http://service.itis.kpfu.ru/", "findById");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "updateResponse");
    private final static QName _AddTripResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "addTripResponse");
    private final static QName _Trip_QNAME = new QName("http://service.itis.kpfu.ru/", "trip");
    private final static QName _LastTripsResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "lastTripsResponse");
    private final static QName _FindAllOrderDateResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "findAllOrderDateResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "findAllResponse");
    private final static QName _LastTrips_QNAME = new QName("http://service.itis.kpfu.ru/", "lastTrips");
    private final static QName _AddTrip_QNAME = new QName("http://service.itis.kpfu.ru/", "addTrip");
    private final static QName _LastEndsTripsForMonth_QNAME = new QName("http://service.itis.kpfu.ru/", "lastEndsTripsForMonth");
    private final static QName _FindByIdResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "findByIdResponse");
    private final static QName _Update_QNAME = new QName("http://service.itis.kpfu.ru/", "update");
    private final static QName _FindBySearch_QNAME = new QName("http://service.itis.kpfu.ru/", "findBySearch");
    private final static QName _FindByStatusOrderDate_QNAME = new QName("http://service.itis.kpfu.ru/", "findByStatusOrderDate");
    private final static QName _FindAll_QNAME = new QName("http://service.itis.kpfu.ru/", "findAll");
    private final static QName _FindAllOrderDate_QNAME = new QName("http://service.itis.kpfu.ru/", "findAllOrderDate");
    private final static QName _FindByStatusOrderDateResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "findByStatusOrderDateResponse");
    private final static QName _LastEndsTripsForMonthResponse_QNAME = new QName("http://service.itis.kpfu.ru/", "lastEndsTripsForMonthResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Trip }
     * 
     */
    public Trip createTrip() {
        return new Trip();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindBySearch }
     * 
     */
    public FindBySearch createFindBySearch() {
        return new FindBySearch();
    }

    /**
     * Create an instance of {@link FindByStatusOrderDate }
     * 
     */
    public FindByStatusOrderDate createFindByStatusOrderDate() {
        return new FindByStatusOrderDate();
    }

    /**
     * Create an instance of {@link LastEndsTripsForMonth }
     * 
     */
    public LastEndsTripsForMonth createLastEndsTripsForMonth() {
        return new LastEndsTripsForMonth();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllOrderDate }
     * 
     */
    public FindAllOrderDate createFindAllOrderDate() {
        return new FindAllOrderDate();
    }

    /**
     * Create an instance of {@link FindByStatusOrderDateResponse }
     * 
     */
    public FindByStatusOrderDateResponse createFindByStatusOrderDateResponse() {
        return new FindByStatusOrderDateResponse();
    }

    /**
     * Create an instance of {@link LastEndsTripsForMonthResponse }
     * 
     */
    public LastEndsTripsForMonthResponse createLastEndsTripsForMonthResponse() {
        return new LastEndsTripsForMonthResponse();
    }

    /**
     * Create an instance of {@link FindBySearchResponse }
     * 
     */
    public FindBySearchResponse createFindBySearchResponse() {
        return new FindBySearchResponse();
    }

    /**
     * Create an instance of {@link AddTripResponse }
     * 
     */
    public AddTripResponse createAddTripResponse() {
        return new AddTripResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link LastTripsResponse }
     * 
     */
    public LastTripsResponse createLastTripsResponse() {
        return new LastTripsResponse();
    }

    /**
     * Create an instance of {@link FindAllOrderDateResponse }
     * 
     */
    public FindAllOrderDateResponse createFindAllOrderDateResponse() {
        return new FindAllOrderDateResponse();
    }

    /**
     * Create an instance of {@link LastTrips }
     * 
     */
    public LastTrips createLastTrips() {
        return new LastTrips();
    }

    /**
     * Create an instance of {@link AddTrip }
     * 
     */
    public AddTrip createAddTrip() {
        return new AddTrip();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Automobile }
     * 
     */
    public Automobile createAutomobile() {
        return new Automobile();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link Trip.Passengers }
     * 
     */
    public Trip.Passengers createTripPassengers() {
        return new Trip.Passengers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findBySearchResponse")
    public JAXBElement<FindBySearchResponse> createFindBySearchResponse(FindBySearchResponse value) {
        return new JAXBElement<FindBySearchResponse>(_FindBySearchResponse_QNAME, FindBySearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTripResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "addTripResponse")
    public JAXBElement<AddTripResponse> createAddTripResponse(AddTripResponse value) {
        return new JAXBElement<AddTripResponse>(_AddTripResponse_QNAME, AddTripResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "trip")
    public JAXBElement<Trip> createTrip(Trip value) {
        return new JAXBElement<Trip>(_Trip_QNAME, Trip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastTripsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "lastTripsResponse")
    public JAXBElement<LastTripsResponse> createLastTripsResponse(LastTripsResponse value) {
        return new JAXBElement<LastTripsResponse>(_LastTripsResponse_QNAME, LastTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrderDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findAllOrderDateResponse")
    public JAXBElement<FindAllOrderDateResponse> createFindAllOrderDateResponse(FindAllOrderDateResponse value) {
        return new JAXBElement<FindAllOrderDateResponse>(_FindAllOrderDateResponse_QNAME, FindAllOrderDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastTrips }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "lastTrips")
    public JAXBElement<LastTrips> createLastTrips(LastTrips value) {
        return new JAXBElement<LastTrips>(_LastTrips_QNAME, LastTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTrip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "addTrip")
    public JAXBElement<AddTrip> createAddTrip(AddTrip value) {
        return new JAXBElement<AddTrip>(_AddTrip_QNAME, AddTrip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastEndsTripsForMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "lastEndsTripsForMonth")
    public JAXBElement<LastEndsTripsForMonth> createLastEndsTripsForMonth(LastEndsTripsForMonth value) {
        return new JAXBElement<LastEndsTripsForMonth>(_LastEndsTripsForMonth_QNAME, LastEndsTripsForMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findBySearch")
    public JAXBElement<FindBySearch> createFindBySearch(FindBySearch value) {
        return new JAXBElement<FindBySearch>(_FindBySearch_QNAME, FindBySearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByStatusOrderDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findByStatusOrderDate")
    public JAXBElement<FindByStatusOrderDate> createFindByStatusOrderDate(FindByStatusOrderDate value) {
        return new JAXBElement<FindByStatusOrderDate>(_FindByStatusOrderDate_QNAME, FindByStatusOrderDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrderDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findAllOrderDate")
    public JAXBElement<FindAllOrderDate> createFindAllOrderDate(FindAllOrderDate value) {
        return new JAXBElement<FindAllOrderDate>(_FindAllOrderDate_QNAME, FindAllOrderDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByStatusOrderDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "findByStatusOrderDateResponse")
    public JAXBElement<FindByStatusOrderDateResponse> createFindByStatusOrderDateResponse(FindByStatusOrderDateResponse value) {
        return new JAXBElement<FindByStatusOrderDateResponse>(_FindByStatusOrderDateResponse_QNAME, FindByStatusOrderDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastEndsTripsForMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.itis.kpfu.ru/", name = "lastEndsTripsForMonthResponse")
    public JAXBElement<LastEndsTripsForMonthResponse> createLastEndsTripsForMonthResponse(LastEndsTripsForMonthResponse value) {
        return new JAXBElement<LastEndsTripsForMonthResponse>(_LastEndsTripsForMonthResponse_QNAME, LastEndsTripsForMonthResponse.class, null, value);
    }

}
