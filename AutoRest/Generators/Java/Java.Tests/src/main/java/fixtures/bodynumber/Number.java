/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodynumber.models.ErrorException;
import java.io.IOException;
import java.math.BigDecimal;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Number.
 */
public interface Number {
    /**
     * The interface defining all the services for Number to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NumberService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/invalidfloat")
        Call<ResponseBody> getInvalidFloat();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/invaliddouble")
        Call<ResponseBody> getInvalidDouble();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/invaliddecimal")
        Call<ResponseBody> getInvalidDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/float/3.402823e+20")
        Call<ResponseBody> putBigFloat(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/float/3.402823e+20")
        Call<ResponseBody> getBigFloat();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/double/2.5976931e+101")
        Call<ResponseBody> putBigDouble(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/double/2.5976931e+101")
        Call<ResponseBody> getBigDouble();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/double/99999999.99")
        Call<ResponseBody> putBigDoublePositiveDecimal(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/double/99999999.99")
        Call<ResponseBody> getBigDoublePositiveDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/double/-99999999.99")
        Call<ResponseBody> putBigDoubleNegativeDecimal(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/double/-99999999.99")
        Call<ResponseBody> getBigDoubleNegativeDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/decimal/2.5976931e+101")
        Call<ResponseBody> putBigDecimal(@Body BigDecimal numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/decimal/2.5976931e+101")
        Call<ResponseBody> getBigDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/decimal/99999999.99")
        Call<ResponseBody> putBigDecimalPositiveDecimal(@Body BigDecimal numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/decimal/99999999.99")
        Call<ResponseBody> getBigDecimalPositiveDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/big/decimal/-99999999.99")
        Call<ResponseBody> putBigDecimalNegativeDecimal(@Body BigDecimal numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/big/decimal/-99999999.99")
        Call<ResponseBody> getBigDecimalNegativeDecimal();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/small/float/3.402823e-20")
        Call<ResponseBody> putSmallFloat(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/small/float/3.402823e-20")
        Call<ResponseBody> getSmallFloat();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/small/double/2.5976931e-101")
        Call<ResponseBody> putSmallDouble(@Body double numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/small/double/2.5976931e-101")
        Call<ResponseBody> getSmallDouble();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("number/small/decimal/2.5976931e-101")
        Call<ResponseBody> putSmallDecimal(@Body BigDecimal numberBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("number/small/decimal/2.5976931e-101")
        Call<ResponseBody> getSmallDecimal();

    }
    /**
     * Get null Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getNull() throws ErrorException, IOException;

    /**
     * Get null Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid float Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidFloat() throws ErrorException, IOException;

    /**
     * Get invalid float Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid double Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidDouble() throws ErrorException, IOException;

    /**
     * Get invalid double Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid decimal Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getInvalidDecimal() throws ErrorException, IOException;

    /**
     * Get invalid decimal Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigFloat() throws ErrorException, IOException;

    /**
     * Get big float value 3.402823e+20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoublePositiveDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoublePositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big double value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoubleNegativeDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoubleNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big double value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalPositiveDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalPositiveDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalPositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalPositiveDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalNegativeDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalNegativeDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalNegativeDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallFloat() throws ErrorException, IOException;

    /**
     * Get big double value 3.402823e-20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getSmallDecimal() throws ErrorException, IOException;

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

}
