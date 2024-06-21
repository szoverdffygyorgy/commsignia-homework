import { useVehicleContext } from "../../contexts/vehicle/vehicle-context";
import VehicleList from "../vehicle-list/vehicle-list";

const Vehicles = () => {
  const { query } = useVehicleContext();

  console.log({ data: query?.data });

  return query?.isLoading ? (
    "Loading vehicles..."
  ) : query?.data ? (
    <VehicleList vehicles={query.data.vehicles} />
  ) : (
    "Failed to load vehicles."
  );
};

export default Vehicles;
