=begin
 This file is part of Hopsworks
 Copyright (C) 2020, Logical Clocks AB. All rights reserved

 Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 the GNU Affero General Public License as published by the Free Software Foundation,
 either version 3 of the License, or (at your option) any later version.

 Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.  See the GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License along with this program.
 If not, see <https://www.gnu.org/licenses/>.
=end

describe "On #{ENV['OS']}" do
  describe "Admin services ops" do
    after :all do
      reset_session
    end

    context "without authentication" do
      before :all do
        reset_session
      end
      it "restricts requests for admin resources from non-admin accounts" do
        get_all_host_services()
        expect_status(401)
        expect_json(errorCode: 200003)
      end
    end

    context "with user authentication" do
      before :all do
        with_valid_session()
      end

      it "restricts requests for admin resources from a normal user account" do
        get_all_host_services()
        expect_status(403)
        expect_json(errorCode: 200014)
      end
    end

    context "with admin authentication and validated user" do
      before :all do
        with_admin_session()
      end

      it "gets metadata of all services" do
        get_all_host_services()
        expect_status(200)
        expect(json_body[:count]).to be > 0
      end

      it "gets metadata of a service by name" do
        get_host_service_by_name("kafka")
        expect_status(200)
        expect(json_body[:count]).to be > 0
      end

      it "fails to get metadata of an unknown service" do
        get_host_service_by_name("#{short_random_id}")
        expect_status(200)
        expect(json_body[:count]).to eq(0)
      end

      it "sorts by id asc" do
        get_all_host_services("?sort_by=id:asc")
        res = json_body[:items].map { |i| i[:id] }
        expect(res).to eq(res.sort)
      end

      it "sorts by id desc" do
        get_all_host_services("?sort_by=id:desc")
        res = json_body[:items].map { |i| i[:id] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by host_id asc" do
        get_all_host_services("?sort_by=host_id:asc")
        res = json_body[:items].map { |i| i[:hostId] }
        expect(res).to eq(res.sort)
      end

      it "sorts by host_id desc" do
        get_all_host_services("?sort_by=host_id:desc")
        res = json_body[:items].map { |i| i[:hostId] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by pid asc" do
        get_all_host_services("?sort_by=pid:asc")
        res = json_body[:items].map { |i| i[:pid] }
        expect(res).to eq(res.sort)
      end

      it "sorts by pid desc" do
        get_all_host_services("?sort_by=pid:desc")
        res = json_body[:items].map { |i| i[:pid] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by name asc" do
        get_all_host_services("?sort_by=name:asc")
        res = json_body[:items].map { |i| i[:name] }.reject { |s| s.match(/-/) || s.match(/_/)}
        expect(res).to eq(res.sort)
      end

      it "sorts by name desc" do
        get_all_host_services("?sort_by=name:desc")
        res = json_body[:items].map { |i| i[:name] }.reject { |s| s.match(/-/) || s.match(/_/)}
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by group_name asc" do
        get_all_host_services("?sort_by=group_name:asc")
        res = json_body[:items].map { |i| i[:group] }.map(&:downcase)
        expect(res).to eq(res.sort)
      end

      it "sorts by group_name desc" do
        get_all_host_services("?sort_by=group_name:desc")
        res = json_body[:items].map { |i| i[:group] }.map(&:downcase)
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by status asc" do
        get_all_host_services("?sort_by=status:asc")
        res = json_body[:items].map { |i| i[:status] }
        expect(res).to eq(res.sort)
      end


      it "sorts by status desc" do
        get_all_host_services("?sort_by=status:desc")
        res = json_body[:items].map { |i| i[:status] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by uptime asc" do
        get_all_host_services("?sort_by=uptime:asc")
        res = json_body[:items].map { |i| i[:uptime] }
        expect(res).to eq(res.sort)
      end

      it "sorts by uptime desc" do
        get_all_host_services("?sort_by=uptime:desc")
        res = json_body[:items].map { |i| i[:uptime] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by start_time asc" do
        get_all_host_services("?sort_by=start_time:asc")
        res = json_body[:items].map { |i| i[:startTime] }
        expect(res).to eq(res.sort)
      end

      it "sorts by start_time desc" do
        get_all_host_services("?sort_by=start_time:desc")
        res = json_body[:items].map { |i| i[:startTime] }
        expect(res).to eq(res.sort.reverse)
      end

      it "sorts by stop_time asc" do
        get_all_host_services("?sort_by=stop_time:asc")
        res = json_body[:items].map { |i| i[:stopTime] }
        expect(res).to eq(res.sort)
      end

      it "sorts by stop_time desc" do
        get_all_host_services("?sort_by=stop_time:desc")
        res = json_body[:items].map { |i| i[:stopTime] }
        expect(res).to eq(res.sort.reverse)
      end
    end
  end
end