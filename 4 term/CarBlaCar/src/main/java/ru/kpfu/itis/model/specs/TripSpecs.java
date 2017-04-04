package ru.kpfu.itis.model.specs;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.access.method.P;
import ru.kpfu.itis.model.Driver;
import ru.kpfu.itis.model.Passenger;
import ru.kpfu.itis.model.Trip;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.utils.DateUtil;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TripSpecs {
    public static Specification<Trip> checkParams(final User user, final Date date) {
        return new Specification<Trip>() {

            List<Predicate> predicates = new ArrayList<Predicate>();


            public Predicate toPredicate(Root<Trip> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                if (date != null) {
                    Date previousMonth = DateUtil.getPreviousMonth(date);
                    predicates.add(cb.greaterThanOrEqualTo(root.<Date>get("date"), previousMonth));
                }
                if (user.getDriver() != null) {
                    predicates.add(cb.equal(root.<Driver>get("driver"), user.getDriver()));
                }

                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}