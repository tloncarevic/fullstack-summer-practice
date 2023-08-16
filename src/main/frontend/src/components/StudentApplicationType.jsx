import { useState } from "react";

import UniStudents from "../classes/UniStudents";
import HsStudents from "../classes/HsStudents";

function StudentApplicationType() {
  const [viewUniStudents, setViewUniStudents] = useState(false);
  const [viewHsStudents, setViewHsStudents] = useState(false);

  /**
   * Handler to view/hide Component
   */
  const handleViewUniStudents = () => {
    setViewUniStudents((value) => !value);
  };

  const handleViewHsStudents = () => {
    setViewHsStudents((value) => !value);
  };

  return (
    <div class="navigation">


      {/* View/Close Button */}
      <button class="button-view-close" onClick={handleViewUniStudents}>
        {viewUniStudents ? `Close` : `View`} UniStudents
      </button>
      &nbsp;
      <button class="button-view-close" onClick={handleViewHsStudents}>
        {viewHsStudents ? `Close` : `View`} HsStudents
      </button>

      {/* Create/Edit Component */}
      {viewUniStudents && <UniStudents />}
      {viewHsStudents && <HsStudents />}
    </div>
  );
}

export default StudentApplicationType;
