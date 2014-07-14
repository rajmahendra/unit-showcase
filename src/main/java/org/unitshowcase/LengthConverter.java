/*
 * Copyright 2014 JUGChennai.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.unitshowcase;

import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.AjaxBehaviorListener;
import javax.inject.Named;
import javax.measure.Unit;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import org.unitsofmeasurement.impl.AbstractQuantity;
import org.unitsofmeasurement.impl.util.SI;
import org.unitsofmeasurement.impl.util.US;

/**
 *
 * @author dwbs
 */
@ManagedBean
@SessionScoped
public class LengthConverter {

    private Unit fromUnit;
    private Unit toUnit;
    private String fromValue;
    private String toValue;
    

    public LengthConverter() {

    }
    private Map<String, Unit> unitsList = new HashMap<>();

    @PostConstruct
    public void init() {
        
        

        unitsList.put("FOOT", US.FOOT);
        unitsList.put("FOOT_SURVEY", US.FOOT_SURVEY);
        unitsList.put("INCH", US.INCH);
        unitsList.put("LIGHT_YEAR", US.LIGHT_YEAR);
        unitsList.put("METER", US.METER);
        unitsList.put("MILE", US.MILE);
        unitsList.put("NAUTICAL_MILE", US.NAUTICAL_MILE);
        unitsList.put("YARD", US.YARD);

    }

    public String getToValue() {
        getConvertedValue();
        return toValue;
    }

    public void setToValue(String toValue) {
        this.toValue = toValue;
    }
    

    public Unit getToUnit() {
        return toUnit;
    }

    public void setToUnit(Unit toUnit) {
        this.toUnit = toUnit;
    }

    public Unit getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Unit fromUnit) {
        this.fromUnit = fromUnit;
    }

    public Map<String, Unit> getUnitsList() {
        return unitsList;
    }

    public void setUnitsList(Map<String, Unit> unitsList) {
        this.unitsList = unitsList;
    }

    public String getFromValue() {
        return fromValue;
    }

    public void setFromValue(String fromValue) {
        this.fromValue = fromValue;
    }

    public void getConvertedValue() {

        {

            if (fromValue == null || fromValue.isEmpty() || fromUnit == null) {
                return;
            }
            double inputVal = 0.0d;
            try {
                inputVal = Double.parseDouble(fromValue);
            } catch (NumberFormatException ne) {
                return;
            }

            AbstractQuantity<Length> l = AbstractQuantity.of(inputVal, fromUnit);
            l = l.to(toUnit, MathContext.DECIMAL32);

            this.toValue = l.toString();

        }
    }

}
