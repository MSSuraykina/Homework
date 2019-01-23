package homework.lesson6.task1;

import homework.lesson6.task1.departament.*;

import java.util.Objects;

public class Department extends Baykonur{
    private AdministrativeDepartment administrativeDepartment;
    private AmbulatoryUnit ambulatoryUnit;
    private AssemblyDepartment assemblyDepartment;
    private Bookkeeping bookkeeping;
    private Garage garage;
    private HospitalWard hospitalWard;
    private MaintenanceDepartment maintenanceDepartment;
    private String name;


    public Department(String name) {
        this.name = name;
    }

    public AdministrativeDepartment getAdministrativeDepartment() {
        return administrativeDepartment;
    }

    public void setAdministrativeDepartment(AdministrativeDepartment administrativeDepartment) {
        this.administrativeDepartment = administrativeDepartment;
    }

    public AmbulatoryUnit getAmbulatoryUnit() {
        return ambulatoryUnit;
    }

    public void setAmbulatoryUnit(AmbulatoryUnit ambulatoryUnit) {
        this.ambulatoryUnit = ambulatoryUnit;
    }

    public AssemblyDepartment getAssemblyDepartment() {
        return assemblyDepartment;
    }

    public void setAssemblyDepartment(AssemblyDepartment assemblyDepartment) {
        this.assemblyDepartment = assemblyDepartment;
    }

    public Bookkeeping getBookkeeping() {
        return bookkeeping;
    }

    public void setBookkeeping(Bookkeeping bookkeeping) {
        this.bookkeeping = bookkeeping;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public HospitalWard getHospitalWard() {
        return hospitalWard;
    }

    public void setHospitalWard(HospitalWard hospitalWard) {
        this.hospitalWard = hospitalWard;
    }

    public MaintenanceDepartment getMaintenanceDepartment() {
        return maintenanceDepartment;
    }

    public void setMaintenanceDepartment(MaintenanceDepartment maintenanceDepartment) {
        this.maintenanceDepartment = maintenanceDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(ambulatoryUnit, that.ambulatoryUnit) &&
                Objects.equals(assemblyDepartment, that.assemblyDepartment) &&
                Objects.equals(bookkeeping, that.bookkeeping) &&
                Objects.equals(garage, that.garage) &&
                Objects.equals(hospitalWard, that.hospitalWard) &&
                Objects.equals(maintenanceDepartment, that.maintenanceDepartment) &&
                Objects.equals(name, that.name) &&
                Objects.equals(administrativeDepartment, that.administrativeDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ambulatoryUnit, assemblyDepartment, bookkeeping, garage, hospitalWard, maintenanceDepartment, name, administrativeDepartment);
    }


}
