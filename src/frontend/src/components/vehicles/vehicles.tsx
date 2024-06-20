import { useQuery } from "@tanstack/react-query";
import getVehicles from "../../api/get-vehicles";

const Vehicles = () => {
  const query = useQuery({
    queryKey: ["vehicles"],
    queryFn: () => getVehicles(),
  });

  console.log(query.data);

  if (!query.isFetched) {
    return "Loading...";
  }

  return <>{`${query.data.vehicles}`}</>;
};

export default Vehicles;
