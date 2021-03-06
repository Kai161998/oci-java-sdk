/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListSuppressionsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID for the compartment.
     */
    private String compartmentId;

    /**
     * The email address of the suppression.
     */
    private String emailAddress;

    /**
     * Search for suppressions that were created within a specific date range,
     * using this parameter to specify the earliest creation date for the
     * returned list (inclusive). Specifying this parameter without the
     * corresponding `timeCreatedLessThan` parameter will retrieve suppressions created from the
     * given `timeCreatedGreaterThanOrEqualTo` to the current time, in \"YYYY-MM-ddThh:mmZ\" format with a
     * Z offset, as defined by RFC 3339.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for suppressions that were created within a specific date range,
     * using this parameter to specify the latest creation date for the returned
     * list (exclusive). Specifying this parameter without the corresponding
     * `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all suppressions created before the
     * specified end date, in \"YYYY-MM-ddThh:mmZ\" format with a Z offset, as
     * defined by RFC 3339.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * The value of the `opc-next-page` response header from the previous
     * GET request.
     *
     */
    private String page;

    /**
     * The maximum number of items to return in a paginated GET request.
     *
     */
    private Integer limit;

    /**
     * The field to sort by. The `TIMECREATED` value returns the list in in
     * descending order by default. The `EMAILADDRESS` value returns the list in
     * ascending order by default. Use the `SortOrderQueryParam` to change the
     * direction of the returned list of items.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. The `TIMECREATED` value returns the list in in
     * descending order by default. The `EMAILADDRESS` value returns the list in
     * ascending order by default. Use the `SortOrderQueryParam` to change the
     * direction of the returned list of items.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Emailaddress("EMAILADDRESS"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SortBy: " + key);
        }
    };

    /**
     * The sort order to use, either ascending or descending order.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending or descending order.
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SortOrder: " + key);
        }
    };

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListSuppressionsRequest o) {
            compartmentId(o.getCompartmentId());
            emailAddress(o.getEmailAddress());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            return this;
        }

        /**
         * Build the instance of ListSuppressionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSuppressionsRequest
         */
        public ListSuppressionsRequest build() {
            ListSuppressionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
